package com.example.mwtrade_web_api.Repositories;


import com.example.mwtrade_web_api.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository
        extends JpaRepository<Product, Long> {


    @Query("SELECT p FROM Product p WHERE p.productId=?1")
    Optional<Product> findById(Long productId);

    @Query("SELECT p FROM Product p WHERE p.productName=?1")
    Optional<Product>findByName(String productName);

    @Query("SELECT p FROM Product p WHERE p.productId=?1")
    Product findProductByPId (Long productId);

}
