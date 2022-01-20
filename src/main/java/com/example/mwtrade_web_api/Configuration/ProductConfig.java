package com.example.mwtrade_web_api.Configuration;

import com.example.mwtrade_web_api.Entities.*;
import com.example.mwtrade_web_api.Repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository,
                                        ProductCategoryRepository productCategoryRepository,
                                        CustomerRepository customerRepository,
                                        BrandRepository brandRepository,
                                        ShoppingCartRepository shoppingCartRepository,
                                        CartItemRepositoy cartItemRepositoy) {
        return args -> {

            /*adding products in the database*/

            Product orange = new Product(
                    "Orange",
                    "Citrus Fruit",
                    "Fresh sourly acidic fruit which provides water ,nutrients and minerals",
                    78,
                    20,
                    5.4f,
                    23.4f,
                    "DailyFruits",
                    "Mmage",
                    "bmage",
                    "smage",
                    "butmage",
                //    "Fruit",
                    7,
                    new Date(),
                    new Date()

            );
            Product mango = new Product(
                    "Mango",
                    "sweet Fruit",
                    "Fresh sweet a fruit which provides water ,nutrients and minerals",
                    100,
                    20,
                    2f,
                    25.1f,
                    "DailyFruits",
                    "Mmage",
                    "bmage",
                    "smage",
                    "butmage",
                   // "Fruit",
                    5,
                    new Date(),
                    new Date()

            );
            Product laptop = new Product(
                    "Laptop21",
                    "elcetronic device",
                    "amazing device to create with",
                    15,
                    34,
                    4.5f,
                    235.5f,
                    "Mac",
                    "Macmmage",
                    "Macbmage",
                    "Macsmage",
                    "Macbutmage",
                    //"Electron",
                    7,
                    new Date(),
                    new Date()

            );

            repository.saveAll(
                    List.of(orange, mango,laptop)
            );

            /*adding Categories in the database*/

            ProductCategory VideoGamesConsoles = new ProductCategory(
                    1l,
                    "Video Games",
                    "vidGameImage",
                    "Category for  Video games Consoles and related items",
                    new Date(),
                    new Date()
            );
            ProductCategory Computers = new ProductCategory(
                    2l,
                    "Computers",
                    "ComImage",
                    "Category for Laptops,Desktops,Computer Hardware",
                    new Date(),
                    new Date()
            );
            ProductCategory Clothes = new ProductCategory(
                    3l,
                    "Fashion",
                    "ClothImage",
                    "Category for all types of clothes",
                    new Date(),
                    new Date()
            );
            ProductCategory Kitchen = new ProductCategory(
                    4l,
                    "Kitchen",
                    "KitchImage",
                    "Category for kitchen equipments",
                    new Date(),
                    new Date()
            );
            ProductCategory Furniture = new ProductCategory(
                    5l,
                    "Furniture",
                    "FurniImage",
                    "Category for furnitures",
                    new Date(),
                    new Date()
            );
            ProductCategory Food = new ProductCategory(
                    6l,
                    "Food",
                    "foodImage",
                    "Category for food items",
                    new Date(),
                    new Date()
            );
            productCategoryRepository.saveAll(
                    List.of(Clothes,Computers,Food,Furniture,Kitchen,VideoGamesConsoles));

            /*adding Customers in the database*/

            Customer Tony = new Customer(
                    "Tony ",
                    "Kanyamauka",
                    "Tk@gmail.com",
                    "tkay_s",
                    "00000",
                    "0996008328",
                    "bangwe 8g",
                    "ntchissi chayamba",
                    "Central region",
                    "Ntchis",
                    "1111",
                    new Date(),
                    new Date()
            );
            Customer James = new Customer(
                    "james ",
                    "john",
                    "JJ@gmail.com",
                    "jezo",
                    "00000",
                    "0883400832",
                    "nambuma",
                    "kachulu",
                    "Central region",
                    "l city",
                    "8881",
                    new Date(),
                    new Date()
            );
            customerRepository.saveAll(List.of(Tony,James));

            /*adding Brands in the database*/

            Brand Lenovo = new Brand(
                    1l,
                    "Lonovo",
                    "Lenovomage",
                    "Lenovo laptops "
            );
            Brand Gucci = new Brand(
                    2l,
                    "Gucci",
                    "guccimage",
                    "Gucci clothes  "
            );
            brandRepository.saveAll(
                    List.of(Lenovo,Gucci)
            );

            Cart_Item cart_item1 = new Cart_Item(
                    2,
                    123f,
                    new Date(),
                    new Date()
            );
            Cart_Item cart_item2 = new Cart_Item(
                    6,
                    50f,
                    new Date(),
                    new Date()
            );
            cartItemRepositoy.saveAll(List.of(cart_item1,cart_item2));

            ShoppingCart cart = new ShoppingCart(
                    new Date(),
                    4,
                    234d
            );
            shoppingCartRepository.save(cart);

        };

    }

}
