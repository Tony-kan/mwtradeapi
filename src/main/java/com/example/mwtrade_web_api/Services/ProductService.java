package com.example.mwtrade_web_api.Services;

import com.example.mwtrade_web_api.Entities.Product;
import com.example.mwtrade_web_api.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    @Autowired
    public ProductService(ProductRepository productRepository
                          ) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public List<Product> getAllPopularProducts() {
        return productRepository.findPopularProducts();
    }


    public Optional<Product> getViewProduct(Long productId) {
        Optional<Product> productOptional = productRepository.findById(productId);
        return productOptional;

    }
    public List<Product> getViewProductByCategory(Long categoryId) {

        List<Product> productOptional = productRepository.findbyCategoryId(categoryId);
        return  productOptional;
    }

    public Optional<Product> getSearchProduct(String productName) {
        Optional <Product> productOptional=productRepository.findByName(productName);
        return productOptional;
    }


    public void addNewProduct(Product product) {
        Optional<Product> productOptional=productRepository.findByName(product.getProductName());
     if(productOptional.isPresent()){
          throw new IllegalStateException("Product name taken");
     }
        productRepository.save(product);
    }

    @Transactional
    public void updateProductInfo(Long productId,
                                  Integer in_stock,
                                  Integer discountPercent,
                                  float productPrice) {
        Product product =productRepository.findById(productId).orElseThrow(() ->
                new IllegalStateException("Product with id "+productId+" is not in the database "));

        if(in_stock!=null &&
                !Objects.equals(product.getIn_Stock(),in_stock)){

            product.setIn_Stock(in_stock);
        }

//        if(discountPercent!=null &&
//        !Objects.equals(product.getDiscountPercent(),discountPercent)){
//            product.setDiscountPercent(discountPercent);
//        }

        if(productPrice!=0.0 &&
        !Objects.equals(product.getPrice(),productPrice)){
            product.setPrice(productPrice);
        }

        product.setModified_at(new Date());
    }

    public void deleteproduct(Long productId) {
        boolean exist=productRepository.existsById(productId);
        if(!exist)
        {
            throw  new IllegalStateException("Product with id "+productId+"DOes not exist");
        }
        productRepository.deleteById(productId);
    }


}
