package com.example.mwtrade_web_api.Controller;

import com.example.mwtrade_web_api.Entities.Product;
import com.example.mwtrade_web_api.Services.ProductService;
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
@RequestMapping(path="/v3/MW_Trade/Home")
@Api("Product")
public class ProductController {

final private ProductService productService;

@Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ApiOperation("List all Products ")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully retrieved list of Products"),
                    @ApiResponse(code = 401, message = "You are not authorized to view those Products"),
                    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
            }
    )
    @GetMapping
    public ResponseEntity<List<Product>> listProducts(){
        List<Product> products =productService.getAllProducts();
        products.forEach(product -> {
            product.add(linkTo(methodOn(ProductController.class).listProducts()).withSelfRel());

            Long productId= product.getProductId();
            product.add(linkTo(methodOn(ProductController.class).viewProduct(productId)).withRel("View-Product"));

           product.add(linkTo(methodOn(ProductController.class).searchProduct(product.getProductName())).withRel("Search-Product-By-Name"));

            product.add(linkTo(methodOn(ProductController.class).addProduct(product)).withRel("Add-New-Product"));

            product.add(linkTo(methodOn(ProductController.class).updateProduct(product.getProductId(),
                    product.getIn_Stock(),
                    product.getDiscountPercent(),
                    product.getProductPrice()
            )).withRel("update-Product"));

            product.add(linkTo(methodOn(ProductController.class).removeProduct(productId)).withRel("delete-Product"));

        });

        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    @ApiOperation("View A Product")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully retrieved A Product"),
                    @ApiResponse(code = 401, message = "You are not authorized to view that Product"),
                    @ApiResponse(code = 403, message = "Accessing the Product you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The Product you were trying to reach is not found")
            }
    )
        @GetMapping("/{productId}")
    public ResponseEntity<Optional<Product>> viewProduct(@PathVariable("productId") Long productId){

           Optional<Product> productOptional = productService.getViewProduct(productId);

            productOptional.map(product -> {

                product.add(linkTo(methodOn(ProductController.class).viewProduct(productId)).withSelfRel());

                product.add(linkTo(methodOn(ProductController.class).listProducts()).withRel("List-All-Products"));

                product.add(linkTo(methodOn(ProductController.class).updateProduct(productId,
                        product.getIn_Stock(),
                        product.getDiscountPercent(),
                        product.getProductPrice())).withRel("Update-Product"));

                product.add(linkTo(methodOn(ProductController.class).removeProduct(productId)).withRel("Delete-Product"));

                return ResponseEntity.ok(product);

            });

    return new ResponseEntity<Optional<Product>>(productOptional,HttpStatus.OK);
        }

    @ApiOperation("Search for A Product")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully retrieved A Product"),
                    @ApiResponse(code = 401, message = "You are not authorized to view that Product"),
                    @ApiResponse(code = 403, message = "Accessing the Product you were trying to reach is forbidden"),
                    @ApiResponse(code = 404, message = "The Product you were trying to reach is not found")
            }
    )
        @GetMapping("/Search/{productName}")
    public ResponseEntity<Optional<Product>> searchProduct(@PathVariable("productName") String productName){

            Optional<Product> productOptional = productService.getSearchProduct(productName);

            productOptional.map(product -> {

                product.add(linkTo(methodOn(ProductController.class).searchProduct(productName)).withSelfRel());

                product.add(linkTo(methodOn(ProductController.class).listProducts()).withRel("List-All-Products"));

                product.add(linkTo(methodOn(ProductController.class).updateProduct(product.getProductId(),
                        product.getIn_Stock(),
                        product.getDiscountPercent(),
                        product.getProductPrice())).withRel("Update-Product"));

                product.add(linkTo(methodOn(ProductController.class).removeProduct(product.getProductId())).withRel("Delete-Product"));

                return ResponseEntity.ok(product);

            });

            return new ResponseEntity<Optional<Product>>(productOptional,HttpStatus.OK);
        }


        @ApiOperation("Add A New Product ")
        @PostMapping(path="/productAdd/")
    public Object addProduct(@RequestBody Product product){
    productService.addNewProduct(product);
            return null;
        }

        @ApiOperation("Update  Product Details")
    @PutMapping(path="/ProductUpdate/{productId}")
    public Object updateProduct (
            @PathVariable("productId") Long productId,
            @RequestParam(required = false) Integer in_Stock,
            @RequestParam(required = false) Integer discountPercent,
            @RequestParam(required = false) float productPrice
    ){
        productService.updateProductInfo(productId,in_Stock,discountPercent,productPrice);
        return null;
    }

    @ApiOperation("Remove A Product from Online")
    @DeleteMapping("/ProductRemove/{productId}")
    public Object removeProduct(@PathVariable("productId") Long productId){

        productService.deleteproduct(productId);

        return null;
    }

}
