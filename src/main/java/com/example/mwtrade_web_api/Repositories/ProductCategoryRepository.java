package com.example.mwtrade_web_api.Repositories;

import com.example.mwtrade_web_api.Entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductCategoryRepository
extends JpaRepository<ProductCategory, Long> {

    @Query("SELECT p FROM ProductCategory p WHERE p.categoryId=?1")
    Optional<ProductCategory> findById(Long categoryId);

    @Query("SELECT p FROM ProductCategory p WHERE p.categoryName=?1")
    Optional<ProductCategory>findByName(String categoryName);

}
