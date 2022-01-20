package com.example.mwtrade_web_api.Services;


import com.example.mwtrade_web_api.Entities.ProductCategory;
import com.example.mwtrade_web_api.Repositories.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CategoryService {

    private final ProductCategoryRepository productCategoryRepository;



    @Autowired
    public CategoryService(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    public List<ProductCategory> getAllCategories() {
       return productCategoryRepository.findAll();
    }


    public Optional<ProductCategory> getCategoryById(Long categoryId) {
        Optional<ProductCategory> optionalCategory=productCategoryRepository.findById(categoryId);
        return optionalCategory;
    }

    public Optional<ProductCategory> getCategoryByName(String categoryName) {
        Optional<ProductCategory> optionalProductCategory1 =productCategoryRepository.findByName(categoryName);
        return optionalProductCategory1;
    }

    public void addNewCategory(ProductCategory productCategory) {
        Optional<ProductCategory> category=productCategoryRepository.findById(productCategory.getCategoryId());
        if(category.isPresent()){
            throw new IllegalStateException("category id taken");
        }
        productCategoryRepository.save(productCategory);

    }

    @Transactional
    public void updateCategoryById(Long categoryId,
                                   String categoryName,
                                   String categoryImage,
                                   String categoryDescription) {
        ProductCategory category =productCategoryRepository.findById(categoryId).orElseThrow(() ->
                new IllegalStateException("Category with id "+categoryId+" is not in the database "));

        if(categoryName!=null &&
                !Objects.equals(category.getCategoryName(),categoryName)){
            category.setCategoryName(categoryName);
        }
        if(categoryImage !=null &&
        !Objects.equals(category.getCategoryImage(),categoryImage)){
            category.setCategoryImage(categoryImage);
        }
        if(categoryDescription != null &&
        !Objects.equals(category.getCategoryDescription(),categoryDescription)){
            category.setCategoryDescription(categoryDescription);
        }
        category.setModified_At(new Date());
    }

    public void deleteCategoryById(Long categoryId) {
        Boolean exists =productCategoryRepository.existsById(categoryId);
        if(!exists){
            throw new IllegalStateException("Category with id "+categoryId+" does not exists");
        }
        productCategoryRepository.deleteById(categoryId);
    }
}
