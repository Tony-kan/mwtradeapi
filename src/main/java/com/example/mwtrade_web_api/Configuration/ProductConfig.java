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
//                                        ProductCategoryRepository productCategoryRepository,
                                        CustomerRepository customerRepository,
                                        BrandRepository brandRepository,
                                        ShoppingCartRepository shoppingCartRepository,
                                        CartItemRepositoy cartItemRepositoy) {
        return args -> {

            /*adding products in the database*/

            Product shoe1 = new Product(
                    "Canvas Sneaker",
                    "Wonder Nation Little Girl & Big Girl Casual Canvas Sneaker,size 13-6",
                    40,
                    20,
                    15000.00f,
                    "Shoes",
                    "Assets/images/Popular_Products/shoes3/shoe3_front.jpeg",
                    "bmage",
                    "smage",
                    "tmage",
                    "butmage",
                    "shoe",
                    "Sneaker",
                    "Canvas",
                    8L,
                    new Date(),
                    new Date()

            );
            Product bag1 = new Product(
                    "Travel Rio",
                    "U.S.Traveler Rio 2-oiece Carry-on Luggage set",
                    15,
                    20,
                    89000.50f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag8/Travel Rio carryon luggage display.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag8/Travel Rio carryon luggage inside.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag8/Travel Rio carryon luggage side.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag8/Travel Rio carryon luggage top.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag8/Travel Rio carryon luggage bottom.jpeg",
                    "bag",
                    "Travel",
                    "luggage",
                    6L,
                    new Date(),
                    new Date()

            );
            Product bag2 = new Product(
                    "Vera Bradley",
                    "Vera Bradley Womens Recylced Cotton Tripple Zip Hipster Crossbody Bag Butterfly By",
                    70,
                    34,
                    17000f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag4/Hipster crossbody handbag display.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Bags/bag4/Hipster crossbody handbag  sides.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag4/Hipster crossbody handbag  top.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag4/Hipster crossbody handbag  far.jpeg",
                    "women",
                    "bag",
                    "crossbody",
                    6L,
                    new Date(),
                    new Date()

            );
            Product earbud1 = new Product(
                    "UrbanX",
                    "Wireless earbud Bluetooth 5.0 HeadPhones with digital LED Display Charging Case Stereo Mini Earphones n Ear Headset Waterproof for Tecno Spark 6 Air",
                    23,
                    34,
                    13000f,
                    "Sound",
                    "Assets/images/All Products/Electronics/sounds/digital LED wireless earbuds.png",
                    "",
                    "",
                    "",
                    "",
                    "urbanx",
                    "earbud",
                    "wireless",
                    5l,
                    new Date(),
                    new Date()

            );
            Product headphone1 = new Product(
                    "COWIN E7 earbuds",
                    "COWIN E7 Active Noise Cancelling Heaadphones Bluetooth Headphones with Mic Deep Bass Wirelesss HeadPhones Over ear(black)",
                    47,
                    34,
                    8500f,
                    "Sound",
                    "Assets/images/All Products/Electronics/sounds/COWIN E7 headphones.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "headphone",
                    "cowin",
                    "earbud",
                    5L,
                    new Date(),
                    new Date()

            );
            Product p1 = new Product(
                    "",
                    "",
                    0,
                    0,
                    0f,
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    5L,
                    new Date(),
                    new Date()

            );

            repository.saveAll(
                    List.of(shoe1,bag1,bag2,earbud1,headphone1)
            );

            /*adding Categories in the database*/

//            ProductCategory VideoGamesConsoles = new ProductCategory(
//                    1l,
//                    "Video Games",
//                    "vidGameImage",
//                    "Category for  Video games Consoles and related items",
//                    new Date(),
//                    new Date()
//            );
//            ProductCategory Computers = new ProductCategory(
//                    2l,
//                    "Computers",
//                    "ComImage",
//                    "Category for Laptops,Desktops,Computer Hardware",
//                    new Date(),
//                    new Date()
//            );
//            ProductCategory Clothes = new ProductCategory(
//                    3l,
//                    "Fashion",
//                    "ClothImage",
//                    "Category for all types of clothes",
//                    new Date(),
//                    new Date()
//            );
//            ProductCategory Kitchen = new ProductCategory(
//                    4l,
//                    "Kitchen",
//                    "KitchImage",
//                    "Category for kitchen equipments",
//                    new Date(),
//                    new Date()
//            );
//            ProductCategory Furniture = new ProductCategory(
//                    5l,
//                    "Furniture",
//                    "FurniImage",
//                    "Category for furnitures",
//                    new Date(),
//                    new Date()
//            );
//            ProductCategory Food = new ProductCategory(
//                    6l,
//                    "Food",
//                    "foodImage",
//                    "Category for food items",
//                    new Date(),
//                    new Date()
//            );
//            productCategoryRepository.saveAll(
//                    List.of(Clothes,Computers,Food,Furniture,Kitchen,VideoGamesConsoles));

            /*adding Customers in the database*/

            Customer Tony = new Customer(
                    "Tony ",
                    "Kanyamauka",
                    "Tk@gmail.com",
                    "00000",
                    new Date(),
                    new Date()
            );
            Customer James = new Customer(
                    "james ",
                    "john",
                    "JJ@gmail.com",
                    "00000",
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
