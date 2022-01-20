package com.example.mwtrade_web_api.Controller;

import com.example.mwtrade_web_api.Entities.ProductCategory;
import com.example.mwtrade_web_api.Services.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(path="/v3/MW_Trade/Home/category")
@Api("Category")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ApiOperation("List all Categories of Products")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully retrieved list of All Categories of products"),
                    @ApiResponse(code = 401, message = "You are not authorized to view those Categories"),
                    @ApiResponse(code = 403, message = "Accessing the Category you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The category you were trying to reach is not found")
            }
    )
    @GetMapping
    public ResponseEntity<List<ProductCategory>> listAllCategories(){

        List<ProductCategory> categories =categoryService.getAllCategories();
        categories.forEach(category -> {
            category.add(linkTo(methodOn(CategoryController.class).listAllCategories()).withSelfRel());

            category.add(linkTo(methodOn(CategoryController.class).searchCategoryById(category.getCategoryId())).withRel("Search-Category-By-Id"));

            category.add(linkTo(methodOn(CategoryController.class).searchCategoryByName(category.getCategoryName())).withRel("Search-Category-By-Name"));

            category.add(linkTo(methodOn(CategoryController.class).newCategory(category)).withRel("Adding-New-Category"));

            category.add(linkTo(methodOn(CategoryController.class).updateCategory(category.getCategoryId(),
                    category.getCategoryName(),
                    category.getCategoryImage(),
                    category.getCategoryDescription()
            )).withRel("Update-Category"));

            category.add(linkTo(methodOn(CategoryController.class).deleteCategory(category.getCategoryId())).withRel("Delete-Category"));

        });

        return new ResponseEntity<List<ProductCategory>>(categories,HttpStatus.OK);
   }

    @ApiOperation("Search A Category Using category Id")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully retrieved list of All Categories of products with Category Id Specified"),
                    @ApiResponse(code = 401, message = "You are not authorized to view those Categories"),
                    @ApiResponse(code = 403, message = "Accessing the Category you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The category you were trying to reach is not found")
            }
    )
    @GetMapping(path="/idsearch/{categoryId}")
    public ResponseEntity<Optional<ProductCategory>> searchCategoryById(@PathVariable("categoryId") Long categoryId){

        Optional<ProductCategory> productCategoryOptional= categoryService.getCategoryById(categoryId);

        productCategoryOptional.map(category -> {

            category.add(linkTo(methodOn(CategoryController.class).searchCategoryById(categoryId)).withSelfRel());

            category.add(linkTo(methodOn(CategoryController.class).listAllCategories()).withRel("List-All-Categories"));

            category.add(linkTo(methodOn(CategoryController.class).updateCategory(categoryId,
                    category.getCategoryName(),
                    category.getCategoryImage(),
                    category.getCategoryDescription())).withRel("Update-Category"));

            category.add(linkTo(methodOn(CategoryController.class).deleteCategory(categoryId)).withRel("Delete-Category"));

            return ResponseEntity.ok(category);

        });

        return new ResponseEntity<Optional<ProductCategory>>(productCategoryOptional,HttpStatus.OK);
    }

    @ApiOperation("search Categories using Category name")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully retrieved list of All Categories of products"),
                    @ApiResponse(code = 401, message = "You are not authorized to view those Categories"),
                    @ApiResponse(code = 403, message = "Accessing the Category you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The category you were trying to reach is not found")
            }
    )
    @GetMapping(path="/namesearch/{categoryName}")
    public  ResponseEntity<Optional<ProductCategory>> searchCategoryByName(@PathVariable("categoryName") String categoryName){

        Optional<ProductCategory> productCategoryOptional=categoryService.getCategoryByName(categoryName);

        productCategoryOptional.map(category -> {

            category.add(linkTo(methodOn(CategoryController.class).searchCategoryByName(categoryName)).withSelfRel());

            category.add(linkTo(methodOn(CategoryController.class).listAllCategories()).withRel("List-All-Categories"));

            category.add(linkTo(methodOn(CategoryController.class).updateCategory(category.getCategoryId(),
                    category.getCategoryName(),
                    category.getCategoryImage(),
                    category.getCategoryDescription())).withRel("Update-Category"));

            category.add(linkTo(methodOn(CategoryController.class).deleteCategory(category.getCategoryId())).withRel("Delete-Category"));

            return ResponseEntity.ok(category);

        });

        return new ResponseEntity<Optional<ProductCategory>>(productCategoryOptional,HttpStatus.OK);
    }

    @ApiOperation("Create A New Category")
    @PostMapping(path="/admin/newcategory/")
    public Object newCategory(@RequestBody ProductCategory productCategory){
        categoryService.addNewCategory(productCategory);

        return null;
    }

    @ApiOperation("Update A Category")
    @PutMapping(path="/admin/updateCategory/{categoryId}")
    public Object updateCategory(@PathVariable("categoryId") Long categoryId,
                                 @RequestParam(required = false) String categoryName,
                                 @RequestParam(required = false) String categoryImage,
                                 @RequestParam(required = false) String categoryDescription){
        categoryService.updateCategoryById(categoryId,categoryName,categoryImage,categoryDescription);

        return null;
    }

    @ApiOperation("Remove A category")
    @DeleteMapping(path="/admin/deletecategory/{categoryId}")
    public Object deleteCategory(@PathVariable("categoryId") Long categoryId){
        categoryService.deleteCategoryById(categoryId);
        return null;
    }

}
