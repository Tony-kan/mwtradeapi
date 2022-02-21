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

           /* pc    */
            Product pc1 = new Product(
                    "Gateway ultra Slim notebook",
                    "Gateway 15.6'' utra Slim Notebook with Carrying Case & Wireless Mouse,FHD,Intel Core i3-1115G4,Dual Core,4GB Memory,128GB SSD,Tuned by THX Audio,1.0MP Webcam,HDMI,Cortana,Windows 11 s",
                    7,
                    4.5f,
                    20,
                    200600f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop1/Gateway 15.6'' ultra slim notebook display.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop1/Gateway 15.6'' ultra slim notebook tilt.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop1/Gateway 15.6'' ultra slim notebook side .jpeg\n",
                    "Assets/images/All Products/Electronics/PC/laptop1/Gateway 15.6'' ultra slim notebook top.jpeg",
                    "",
                    "laptop",
                    "Slim",
                    "Gateway",
                    1L,
                    new Date(),
                    new Date()

            );
            Product pc2 = new Product(
                    "HP Laptop",
                    "HP 15.6'' Laptop,Intel Pentium Silver N5000,4GB RAM,128GB SSD,Windows 10 Home with Office ,Scarlet Red,!5-dw))83wm",
                    21,
                    3.5f,
                    34,
                    187000f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop2/HP 15.6'' Laptop display.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop2/HP 15.6'' Laptop back.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop2/HP 15.6'' Laptop side.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop2/HP 15.6'' Laptop spec.jpeg",
                    "",
                    "laptop",
                    "HP",
                    "intel",
                    1L,
                    new Date(),
                    new Date()

            );
            Product pc3 = new Product(
                    "Lenovo IDeapad Flex 5i",
                    "Lenovo Ideapad Flex 5i 14'' FDH 2-in-1 Touchscreen Laptop,Intel Core i3,$Gb RAM,128GB SSD,Graphite Gray,Windows 10,82HS007CUS",
                    13,
                    5.0f,
                    63,
                    260000f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop3/Lenovo Ideapad Flex 5i 14'' display.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop3/Lenovo Ideapad Flex 5i 14'' back.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop3/Lenovo Ideapad Flex 5i 14'' inside.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop3/Lenovo Ideapad Flex 5i 14'' top.jpeg",
                    "",
                    "laptop",
                    "Lenovo",
                    "Ideapad",
                    1L,
                    new Date(),
                    new Date()

            );
            Product pc4 = new Product(
                    "MacBook Pro 13.3",
                    "Refurbished Apple MacBook Pro 13.3 Laptop LED Intel i5 3210M 2.5GHz 4GB 500GB-MD101LLA",
                    5,
                    6.0f,
                    223,
                    400700f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop4/Refurbished Apple MacBook Pro 13.3 display.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop4/Refurbished Apple MacBook Pro 13.3 tilt.webp",
                    "Assets/images/All Products/Electronics/PC/laptop4/Refurbished Apple MacBook Pro 13.3 side.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop4/Refurbished Apple MacBook Pro 13.3 top.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop4/Refurbished Apple MacBook Pro 13.3 inside.png",
                    "laptop",
                    "MacBook pro",
                    "Apple",
                    1L,
                    new Date(),
                    new Date()

            );
            Product pc5 = new Product(
                    "Lenovo Chromebook C340",
                    "Lenovo Chromebook C340-11.6'' Touchscreen -Intel Celeron N4000-4GB-32GB eMMC-Platinum Grey-Chrome OS-81TA0010US",
                    45,
                    3.5f,
                    11,
                    220000f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop5/Lenovo Chromebook C340-11.6'' Touchscreen display.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop5/Lenovo Chromebook C340-11.6'' Touchscreen tilt.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop5/Lenovo Chromebook C340-11.6'' Touchscreen side.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop5/Lenovo Chromebook C340-11.6'' Touchscreen top.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop5/Lenovo Chromebook C340-11.6'' Touchscreen spec.jpeg",
                    "laptop",
                    "",
                    "",
                    1L,
                    new Date(),
                    new Date()

            );
            Product pc6 = new Product(
                    "Samsung Chromebook 4",
                    "Samsung N4020,4GB RAM,32GB SSD,Chrome OS,platinum Titan,XE310XBA",
                    17,
                    4.5f,
                    76,
                    110550.5f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop6/Samsung Chromebook 4 11.6'' display.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop6/Samsung Chromebook 4 11.6'' back.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop6/Samsung Chromebook 4 11.6'' side.webp",
                    "Assets/images/All Products/Electronics/PC/laptop6/Samsung Chromebook 4 11.6'' top.jpeg",
                    "",
                    "laptop",
                    "Samsung",
                    "Chromebook",
                    1L,
                    new Date(),
                    new Date()

            );
            Product pc7 = new Product(
                    "MSI GF63",
                    "MSI GF63 Thin Gaming Laptop,15.6'' FDH Display,Intel Core i5-10300H,NVIDIA GeForce GTX 1650 MaxQ,8GB DDR4,256GB NVme SSD,Black,windows 10-GF63222",
                    35,
                    5.0f,
                    186,
                    760700.7f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop7/MSI GF63 Thin Gaming Laptop display.webp",
                    "Assets/images/All Products/Electronics/PC/laptop7/MSI GF63 Thin Gaming Laptop inside.png",
                    "Assets/images/All Products/Electronics/PC/laptop7/MSI GF63 Thin Gaming Laptop side.png",
                    "Assets/images/All Products/Electronics/PC/laptop7/MSI GF63 Thin Gaming Laptop top.png",
                    "Assets/images/All Products/Electronics/PC/laptop7/MSI GF63 Thin Gaming Laptop keyboard.png",
                    "laptop",
                    "MSI",
                    "Gaming",
                    1L,
                    new Date(),
                    new Date()

            );
            Product pc8 = new Product(
                    "ASUS ROG Strix",
                    "ASUS ROG Strix 15.6'' RTX 3060,Gaming Laptop,15.6''FDH,AMD Ryzen 9 5900HX,NVIDIA GeForce RTX 3060,16GB RAM,1TB SSD,Eclipse Gray,Windows 10 Home,G513QM-WS96",
                    5,
                    6.0f,
                    23,
                    1200000f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop8/Asus ROG Strix 15.6'' display.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop8/Asus ROG Strix 15.6'' back.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop8/Asus ROG Strix 15.6'' spec.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop8/Asus ROG Strix 15.6'' top.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop8/Asus ROG Strix 15.6'' bottom.jpeg",
                    "laptop",
                    "ASUS",
                    "Gaming",
                    1L,
                    new Date(),
                    new Date()

            );
            Product pc9 = new Product(
                    "Lenovo LEGION",
                    "Lenovo Legion 5 R5 GeForce GTX 1650Ti 8GBRAM 256GB SSD",
                    3,
                    4.0f,
                    5,
                    870500.5f,
                    "Laptops",
                    "Assets/images/All Products/Electronics/PC/laptop9/Lenovo LEGION display.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop9/Lenovo LEGION spec.png",
                    "Assets/images/All Products/Electronics/PC/laptop9/Lenovo LEGION side.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop9/Lenovo LEGION top.jpeg",
                    "Assets/images/All Products/Electronics/PC/laptop9/Lenovo LEGION inside.jpeg",
                    "laptop",
                    "Lenovo",
                    "Legion",
                    1L,
                    new Date(),
                    new Date()

            );

            /* phones*/

            Product phone1 = new Product(
                    "Tecno Spark 6 GO",
                    "Tecno SPark 6 GO KE5K 64GB ,4GB RAM 6.52'' LTE GSM 13MP Factory Unlocked Smartphone-Global Model-Horizon Orange",
                    13,
                    4.0f,
                    120,
                    176350.5f,
                    "Phone",
                    "Assets/images/All Products/Electronics/Phone/phone3/Tecno Spark 6 GO KE5K display.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone3/Tecno Spark 6 GO KE5K inside.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone3/Tecno Spark 6 GO KE5K side.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone3/Tecno Spark 6 GO KE5K info.jpeg",
                    "",
                    "phone",
                    "Tecno",
                    "Spark",
                    2L,
                    new Date(),
                    new Date()

            );
            Product phone2 = new Product(
                    "Motorola Moto E",
                    "Straight talk Motorola Moto E,32GB,Midnight Blue-Prepaid Smartphone",
                    50,
                    2.5f,
                    24,
                    67000.5f,
                    "Phone",
                    "Assets/images/All Products/Electronics/Phone/phone2/Motorola Moto E display.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone2/Motorola Moto E info1.webp",
                    "Assets/images/All Products/Electronics/Phone/phone2/Motorola Moto E info2.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone2/Motorola Moto E info3.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone2/Motorola Moto E info4.webp",
                    "phone",
                    "Motorola",
                    "Moto",
                    2L,
                    new Date(),
                    new Date()

            );
            Product phone3 = new Product(
                    "AT&T Samsung A13",
                    "AT&T Samsung A13 5G,64GB,Black-Prepaid Smartphone",
                    43,
                    5.5f,
                    56,
                    275850.6f,
                    "Phone",
                    "Assets/images/All Products/Electronics/Phone/phone1/AT & T Samsung A13 5G display.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone1/AT & T Samsung A13 5G back.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone1/AT & T Samsung A13 5G tilt.jpeg",
                    "Assets/images/All Products/Electronics/Phone/phone1/AT & T Samsung A13 5G info.png",
                    "",
                    "phone",
                    "Samsung",
                    "A13",
                    2L,
                    new Date(),
                    new Date()

            );

/* tablets */
            Product tab1 = new Product(
                    "SAMSUNG Galaxy S6 Lite",
                    "SAMSUNG Galaxy Tab S6 Lite,64GB Oxford Gray(wi-fi)S Pen included-SM-P610NZAMXAR",
                    16,
                    5.0f,
                    12,
                    245000f,
                    "Tablets",
                    "Assets/images/All Products/Electronics/Tablets/tablet1/Samsung Galaxy Tab S6 Lite display.jpeg",
                    "Assets/images/All Products/Electronics/Tablets/tablet1/Samsung Galaxy Tab S6 Lite back.jpeg",
                    "Assets/images/All Products/Electronics/Tablets/tablet1/Samsung Galaxy Tab S6 Lite side.jpeg",
                    "Assets/images/All Products/Electronics/Tablets/tablet1/Samsung Galaxy Tab S6 Lite tilt.jpeg",
                    "Assets/images/All Products/Electronics/Tablets/tablet1/Samsung Galaxy Tab S6 Lite inside.jpeg",
                    "Tablet",
                    "SAMSUNG",
                    "Galaxy",
                    3L,
                    new Date(),
                    new Date()

            );
            Product tab2 = new Product(
                    "SAMSUNG Galaxy S7",
                    "SAMSUNG Galaxy Tab S7 FE Mystic Black 64GB",
                    3,
                    5.5f,
                    77,
                    320000f,
                    "Tablets",
                    "Assets/images/All Products/Electronics/Tablets/tablet2/Samsung Galaxy Tab S7 FE display.jpeg",
                    "Assets/images/All Products/Electronics/Tablets/tablet2/Samsung Galaxy Tab S7 FE tilt.jpeg",
                    "",
                    "",
                    "",
                    "Tablet",
                    "samsung",
                    "S7",
                    3L,
                    new Date(),
                    new Date()

            );
            Product tab3 = new Product(
                    "Contixo kids tablet",
                    "Contixo 7'' kids Tablet 16GB wifi Android Tablet for kids Bluetooth Parental control pre-installed Learning Tablet App for toddlers Children kid-proof protective cae,V8-2 Blue",
                    34,
                    4.0f,
                    34,
                    62675.5f,
                    "Tablets",
                    "Assets/images/All Products/Electronics/Tablets/tablet3/Contixo 7'' kids Tablet display.jpeg",
                    "Assets/images/All Products/Electronics/Tablets/tablet3/Contixo 7'' kids Tablet inside.jpeg",
                    "Assets/images/All Products/Electronics/Tablets/tablet3/Contixo 7'' kids Tablet info.jpeg",
                    "",
                    "",
                    "Tablet",
                    "Contixo",
                    "kids",
                    3L,
                    new Date(),
                    new Date()

            );


           /* TV */

//            Product TV1 = new Product(
//                    "",
//                    "",
//                    0,
//                    0,
//                    0,
//                    0f,
//                    "TV",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "TV",
//                    "",
//                    "",
//                    4L,
//                    new Date(),
//                    new Date()
//
//            );
//            Product TV2 = new Product(
//                    "",
//                    "",
//                    0,
//                    0,
//                    0,
//                    0f,
//                    "TV",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "TV",
//                    "",
//                    "",
//                    4L,
//                    new Date(),
//                    new Date()
//
//            );
//            Product TV3 = new Product(
//                    "",
//                    "",
//                    0,
//                    0,
//                    0,
//                    0f,
//                    "TV",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "TV",
//                    "",
//                    "",
//                    4L,
//                    new Date(),
//                    new Date()
//
//            );

/*   Sound  */

            Product sound1 = new Product(
                    "UrbanX",
                    "Wireless earbud Bluetooth 5.0 HeadPhones with digital LED Display Charging Case Stereo Mini Earphones n Ear Headset Waterproof for Tecno Spark 6 Air",
                    23,
                    5.0f,
                    89,
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
            Product sound2 = new Product(
                    "COWIN E7 Earbuds",
                    "COWIN E7 Active Noise Cancelling Heaadphones Bluetooth Headphones with Mic Deep Bass Wirelesss HeadPhones Over ear(black)",
                    47,
                    6.0f,
                    120,
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

            Product sound3 = new Product(
                    "Wireless EarbudsBluetooth 5.0",
                    "Wireless EarbudsBluetooth 5.0 wireless earbuds Bluetooth Headphones with Deep Bass HiFi 3D Stereo Sound Built-in Mic Earphones with prtable Charging case for smartphones and laptops(White)",
                    67,
                    4.5f,
                    25,
                    13000f,
                    "Sound",
                    "Assets/images/All Products/Electronics/sounds/earbud bluetooth 5.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "sound",
                    "bluetooth",
                    "wireless",
                    5L,
                    new Date(),
                    new Date()

            );
            Product sound4 = new Product(
                    "Jelly Comb",
                    "On Ear headphones with Mic,Jelly Comb Foldable Corded Headphones Wired Headsets with microphone,Volume Control for cell Phone,tablet,PC,Laptop,mp3/4,video game",
                    14,
                    5.0f,
                    59,
                    16000.5f,
                    "Sound",
                    "Assets/images/All Products/Electronics/sounds/Jelly Comb headphones.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "sound",
                    "headphones",
                    "microphone",
                    5L,
                    new Date(),
                    new Date()

            );
            Product sound5 = new Product(
                    "Gaming headset",
                    "Mpow 2.4GHz Gaming Headset with Noise cancelling Mic,3.5mm PC Headset with Bass Surround ,LED Ligh",
                    8,
                    4.5f,
                    26,
                    17800.00f,
                    "Sound",
                    "Assets/images/All Products/Electronics/sounds/Mpow headset.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "sound",
                    "Gaming",
                    "Headset",
                    5L,
                    new Date(),
                    new Date()

            );
            Product sound6 = new Product(
                    "Wired in-Ear Headphones",
                    "UrbanX r2 Wired in-Ear headphones with Mic for tecno Spark 6 Go with Tangle-free cord,Noise Isolating earphones,deep bass,in ear bud silicone tips",
                    72,
                    5.0f,
                    94,
                    3500f,
                    "Sound",
                    "Assets/images/All Products/Electronics/sounds/Urban R2 in-ear headphones.png",
                    "",
                    "",
                    "",
                    "",
                    "sound",
                    "in-ear",
                    "headphones",
                    5L,
                    new Date(),
                    new Date()

            );

            /*   bags  */

            Product bag1 = new Product(
                    "Travel Rio",
                    "U.S.Traveler Rio 2-oiece Carry-on Luggage set",
                    15,
                    3.0f,
                    40,
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
                    4.5f,
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
            Product bag3 = new Product(
                    "Tote Shoulder bag",
                    "Daisy Rose Tote Shoulder Bag and Matching Clutch-PU Vegan Leather Handbag for Travel Work and School-Brown",
                    7,
                    4.5f,
                    43,
                    3500f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag1/Tote shoulder handbag display.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Bags/bag1/Tote shoulder handbag sides.jpeg\n",
                    "Assets/images/All Products/Fashion/Bags/bag1/Tote shoulder handbag top.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag1/Tote shoulder handbag bottom.jpeg",
                    "bag",
                    "Daisy",
                    "leather",
                    6L,
                    new Date(),
                    new Date()

            );
            Product bag4 = new Product(
                    "Unisex Tie Dye Backpack",
                    "NEFF 18 Unisex Tie Dye Backpack with Laptop Sleeve",
                    17,
                    4.0f,
                    20,
                    7500f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag2/Laptop sleeve backpack display.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag2/Laptop sleeve backpack back.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag2/Laptop sleeve backpack  sides.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag2/Laptop sleeve backpack top.jpeg",
                    "",
                    "bag",
                    "backpack",
                    "laptop",
                    6L,
                    new Date(),
                    new Date()

            );
            Product bag5 = new Product(
                    "Women jet set",
                    "Michael Kors Women's Jet Set travel Medium Leather X Cross Dome Crossbody Handbag(Luggage solid/Gold)",
                    11,
                    3.5f,
                    7,
                    18000.5f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag3/travel crossbody handbag display.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "bag",
                    "leather",
                    "Travel",
                    6L,
                    new Date(),
                    new Date()

            );
            Product bag6 = new Product(
                    "Canvas Travelling Bag",
                    "Multifunctional canvas Travelling Bag-6 Styles",
                    28,
                    2.5f,
                    4,
                    14000f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag5/Canvas travelling bag display.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Bags/bag5/Canvas travelling bag side.jpeg",
                    "",
                    "",
                    "bag",
                    "Travelling",
                    "canvas",
                    6L,
                    new Date(),
                    new Date()

            );
            Product bag7 = new Product(
                    "Crossover Duffel Bag",
                    "Crossover Duffel Bag-Large",
                    2,
                    5.0f,
                    9,
                    24000f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag6/crossover duffel bag display .jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Bags/bag6/crossover duffel bag sides.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag6/crossover duffel bag top.jpeg",
                    "",
                    "bag",
                    "crossover",
                    "duffel",
                    6L,
                    new Date(),
                    new Date()

            );
            Product bag8 = new Product(
                    "Rolling bag",
                    "Protege 25'' Rolling Duffel Bag,Black",
                    4,
                    4.0f,
                    75,
                    36000f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag7/Rolling duffel bag display.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag7/Rolling duffel bag back.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag7/Rolling duffel bag inside.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag7/Rolling duffel bag top.jpeg",
                    "",
                    "bag",
                    "Rolling",
                    "Duffel",
                    6L,
                    new Date(),
                    new Date()

            );
            Product bag9 = new Product(
                    "Kids luggage",
                    "GURHODVO kids Luggage Rolling kids Suitcase with Wheels hard Shell Carry on Suitecase 18 inch for toddler boys Cars in General Children Trolley luggage vehicle",
                    11,
                    2.5f,
                    10,
                    38000f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag9/Childrens Trolley luggage display .jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Bags/bag9/Childrens Trolley luggage sides.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag9/Childrens Trolley luggage top.jpeg",
                    "",
                    "bag",
                    "",
                    "",
                    6L,
                    new Date(),
                    new Date()

            );
            Product bag10 = new Product(
                    "Carry on Luggage",
                    "Protege 20'' Briarleigh Rolling Upright Carry On Luggage Purple",
                    8,
                    5.5f,
                    54,
                    64000f,
                    "Bags",
                    "Assets/images/All Products/Fashion/Bags/bag10/Rolling upright carry on luggage display.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag10/Rolling upright carry on luggage back.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag10/Rolling upright carry on luggage inside.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag10/Rolling upright carry on luggage top.jpeg",
                    "Assets/images/All Products/Fashion/Bags/bag10/Rolling upright carry on luggage bottom.jpeg",
                    "bag",
                    "Rolling",
                    "Luggage",
                    6L,
                    new Date(),
                    new Date()

            );

            /*  clothes */
            Product cloth1 = new Product(
                    "Boys Heather shirts",
                    "Russell Boys Heather Long Sleeve 2-pack Shirts,sizes 4-18 & Husky",
                    45,
                    5.0f,
                    34,
                    7500f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth1/Russell Boys Heather.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "cloth",
                    "Boys",
                    "Shirts",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth2 = new Product(
                    "Girls Dress",
                    "HAWEE Girls Dress Bingo Bluey Costume flying Sleeve Casual dress",
                    13,
                    4.0f,
                    20,
                    3600f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth2/HAWEE Girls Dress display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth2/HAWEE Girls Dress single view.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth2/HAWEE Girls Dress size.jpeg",
                    "",
                    "",
                    "cloth",
                    "girls",
                    "casual",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth3 = new Product(
                    "Boys Sweatpants",
                    "RBX Boys sweatpants-4 pack Active tricot warm-up jogger Tract Pants (Size:4-20)",
                    31,
                    4.0f,
                    65,
                    13000f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth3/RBX Boys' Sweatpants display.jpg",
                    "",
                    "",
                    "",
                    "",
                    "cloth",
                    "sweatpants",
                    "jogger",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth4 = new Product(
                    "Pullover Hoodie",
                    "Bonobos Fielder Men's and Big Men's French terry Pullover Hoodie,up to 3XL",
                    6,
                    4.5f,
                    78,
                    7500f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth4/Bonobos Fielder display .jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth4/Bonobos Fielder back.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth4/Bonobos Fielder closeview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth4/Bonobos Fielder sleeve.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth4/Bonobos Fielder longview.jpeg",
                    "cloth",
                    "Hoodie",
                    "men",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth5 = new Product(
                    "Women's Eyelet Seatshirt",
                    "Time and Tru Womens's Eyelet Sweatshirt",
                    23,
                    4.0f,
                    12,
                    7400f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth5/Time and Tru display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth5/Time and Tru back.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth5/Time and Tru closeview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth5/Time and Tru longview.jpeg",
                    "",
                    "cloth",
                    "Sweatshirt",
                    "Women",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth6 = new Product(
                    "Baby boy outfit Set",
                    "Modern Moments By Gerber Baby Boy Henley T-shirt,Short & Romper,3-piece Outfit set,(0/3 Months-24 Months",
                    36,
                    4f,
                    21,
                    0f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth6/Baby 3-piece set display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth6/Baby 3-piece set short.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth6/Baby 3-piece set t-shirt.jpeg",
                    "",
                    "",
                    "cloth",
                    "boy",
                    "baby",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth7 = new Product(
                    "Women Midi dress",
                    "Scoop Women's Halter top Color Block midi dress with Tie at waist",
                    47,
                    5.5f,
                    64,
                    175000f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth7/Scoop Womens Halter Top Midi Dress display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth7/Scoop Womens Halter Top Midi Dress back.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth7/Scoop Womens Halter Top Midi Dress longview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth7/Scoop Womens Halter Top Midi Dress shortvew.jpeg",
                    "",
                    "cloth",
                    "Women",
                    "dress",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth8 = new Product(
                    "Paddy and Pinch",
                    "st. patrick's Day Men's & Big Men's Life of the Paddy and Pinch Proof Graphic Tee Bundle,2-pack",
                    89,
                    5.0f,
                    45,
                    9000f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth8/Paddy and pinch proof Tee bundle display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth8/Paddy and pinch proof Tee bundle  paddyview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth8/Paddy and pinch proof Tee bundle pinchview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth8/Paddy and pinch proof Tee bundle togetherview.jpeg",
                    "",
                    "cloth",
                    "Men",
                    "t-shirt",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth9 = new Product(
                    "Longline Camo",
                    "Epic Men's & Big Men's Longline Camo & Solid T-shirts,2-pack,sizes XS-5XL,Mens Tee Shirts",
                    27,
                    5.0f,
                    31,
                    8600f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth9/Longline Camo slid T-shirts display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth9/Longline Camo slid T-shirts firstview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth9/secondview.jpeg",
                    "",
                    "",
                    "cloth",
                    "mens",
                    "T-shirts",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth10 = new Product(
                    "",
                    "Wonder Nation girl Long Sleeve knit Dresses with leggings(Baby & Toddler),12M-5T,3 pieces",
                    23,
                    4.0f,
                    13,
                    2300.5f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth10/Girl long sleeve Knit dresses with leggings display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth10/Girl long sleeve Knit dresses with leggings leggings view.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth10/Girl long sleeve Knit dresses with leggings redview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth10/Girl long sleeve Knit dresses with leggings yellowview.jpeg",
                    "",
                    "cloth",
                    "leggings",
                    "Women",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth11 = new Product(
                    "Knit jeggings",
                    "Time & Tru Women's Full Length Stretch knit Jeggings",
                    13,
                    5.0f,
                    68,
                    16500f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth11/Stretch Knit Jeggings display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth11/Stretch Knit Jeggings greenview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth11/Stretch Knit Jeggings redview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth11/Stretch Knit Jeggings tilt.jpeg",
                    "",
                    "cloth",
                    "women",
                    "jeggings",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth12 = new Product(
                    "Mens Slim Air jeans",
                    "Free Assembly Men's mid Rise Slim Air Jeans",
                    4,
                    3.5f,
                    12,
                    7800f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth12/Mid Rise Slim Air Jeans display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth12/Mid Rise Slim Air Jeans back.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth12/Mid Rise Slim Air Jeans closeview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth12/Mid Rise Slim Air Jeans longview.jpeg",
                    "",
                    "cloth",
                    "mens",
                    "jeans",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth13 = new Product(
                    "Ripped distressed pants",
                    "JEANS FOR LOVE David-k premium Blue Denim Stretch jeans destroy Skinny ripped distressed pants",
                    76,
                    5.0f,
                    130,
                    17500.5f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth13/Denim Stretch jeans display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth13/Denim Stretch jeans back.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth13/Denim Stretch jeans  side.jpeg",
                    "",
                    "",
                    "cloth",
                    "women",
                    "ripped",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth14 = new Product(
                    "Ripped Skinny jeans",
                    "Women's high Waisted ripped Skinny jeans",
                    10,
                    4.5f,
                    16,
                    0f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth14/Waisted Ripped Skinny jeans display.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "cloth",
                    "women",
                    "jeans",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth15 = new Product(
                    "Boys Rip jeans",
                    "Wonder nation Boys Rip and repair Jeans ,2-pack,sizes 4-18 & Husky",
                    14,
                    4.5f,
                    21,
                    15000f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth15/Boys Rip and Repair jeans display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth15/Boys Rip and Repair jeans blackback.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth15/Boys Rip and Repair jeans greyback.jpeg",
                    "",
                    "",
                    "cloth",
                    "jeans",
                    "boys",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth16 = new Product(
                    "Ripped Skinny Biker jeans",
                    "frecoccialo men's Stretch Ripped Skinny Biker jeans Slim Fit denim pants destroyed Hole",
                    4,
                    5.0f,
                    34,
                    17500f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth16/Men Stretch Ripped Skinny Biker jeans display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth16/Men Stretch Ripped Skinny Biker jeans closeview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth16/Men Stretch Ripped Skinny Biker jeans size.jpeg",
                    "",
                    "",
                    "cloth",
                    "jeans",
                    "men",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth17 = new Product(
                    "Ripped Jeans",
                    "carolilly men Pencil Skinny Ripped destroyed jeans Stretch Slim Fit Hip Hop Holes Fashion male Gigh Quality pants",
                    7,
                    3.5f,
                    7,
                    14500f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth17/Men Pencil Ripped Destroyed Jeans display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth17/Men Pencil Ripped Destroyed Jeans back.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth17/Men Pencil Ripped Destroyed Jeans views.jpeg",
                    "",
                    "",
                    "cloth",
                    "men",
                    "jeans",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth18 = new Product(
                    "Denim pants",
                    "Citgeett men's ripped Distressed Slim Fit denim pants Stretch Skinny Jeans",
                    2,
                    5.5f,
                    3,
                    14500f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth18/Mens Ripped Distressed Slim it Denim skinny jeans display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth18/Mens Ripped Distressed Slim it Denim skinny jeans back.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth18/Mens Ripped Distressed Slim it Denim skinny jeans size.jpeg",
                    "",
                    "",
                    "cloth",
                    "mens",
                    "jeans",
                    7L,
                    new Date(),
                    new Date()

            );
            Product cloth19 = new Product(
                    "Stylish Ripped jeans",
                    "men Stylish Ripped Jeans pants Biker Skinny Slim Straight Denim trousers Zipper",
                    12,
                    4.5f,
                    6,
                    17500f,
                    "Clothes",
                    "Assets/images/All Products/Fashion/Clothes/cloth19/Men Stylish ripped jeans display.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth19/Men Stylish ripped jeans closeview.jpeg",
                    "Assets/images/All Products/Fashion/Clothes/cloth19/Men Stylish ripped jeans sizes.jpeg",
                    "",
                    "",
                    "cloth",
                    "jeans",
                    "mens",
                    7L,
                    new Date(),
                    new Date()

            );


            /* shoes*/
            Product shoe1 = new Product(
                    "Canvas Sneaker",
                    "Wonder Nation Little Girl & Big Girl Casual Canvas Sneaker,size 13-6",
                    40,
                    5.5f,
                    60,
                    15000.00f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe19/Girl Casual Canvas Sneaker display.jpeg",
                    "",
                    "",
                    "Assets/images/All Products/Fashion/Shoes/shoe19/Girl Casual Canvas Sneaker top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe19/Girl Casual Canvas Sneaker bottom.jpeg",
                    "shoe",
                    "Sneaker",
                    "Canvas",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe2 = new Product(
                    "Hightail Sneaker",
                    "Avia Women's Hightail Sneaker (Wide width Available)",
                    34,
                    4.5f,
                    89,
                    6500f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe1/Avia Womens hightail Sneaker display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe1/Avia Womens hightail Sneaker back.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe1/Avia Womens hightail Sneaker side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe1/Avia Womens hightail Sneaker top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe1/Avia Womens hightail Sneaker bottom.jpeg",
                    "shoes",
                    "women",
                    "sneaker",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe3 = new Product(
                    "Air Max Sneaker",
                    "Women's Air Max INTRLK Sneaker",
                    12,
                    4.5f,
                    76,
                    13000.99f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe2/womens air max INTRLK display.png",
                    "Assets/images/All Products/Fashion/Shoes/shoe2/womens air max INTRLK back.png",
                    "Assets/images/All Products/Fashion/Shoes/shoe2/womens air max INTRLK side.png",
                    "Assets/images/All Products/Fashion/Shoes/shoe2/womens air max INTRLK top.png",
                    "",
                    "Shoes",
                    "Sneaker",
                    "Womens",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe4 = new Product(
                    "High-top Sneaker",
                    "Fubu Men's Zone High-top Athletic Basketball Sneakers",
                    31,
                    5.0f,
                    45,
                    21500f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe3/Mens High-top basketball Sneaker display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe3/Mens High-top basketball Sneaker back.jpeg\n",
                    "Assets/images/All Products/Fashion/Shoes/shoe3/Mens High-top basketball Sneaker side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe3/Mens High-top basketball Sneaker top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe3/Mens High-top basketball Sneaker bottom.jpeg",
                    "shoes",
                    "men",
                    "Sneaker",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe5 = new Product(
                    "Slippers Boots",
                    "VONMAY Women's Fuzzy Slippers Boots Memory Foam Boosties House Shoes Indoor Outdoor",
                    52,
                    5.0f,
                    23,
                    19000.99f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe4/Womens Fuzzy Slippers Boots display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe4/Womens Fuzzy Slippers Boots longview.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe4/Womens Fuzzy Slippers Boots side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe4/Womens Fuzzy Slippers Boots top.jpeg",
                    "",
                    "shoes",
                    "women",
                    "slippers",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe6 = new Product(
                    "Moccasin Slippers",
                    "VONMAY Men's Moccasin Slippers Fuzzy House Shoes Fluffy fur Home Warm Memoru Foam Indoor Outdoor",
                    9,
                    4.0f,
                    12,
                    16000.5f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe5/Men Moccasin Slippers Fuzzy display.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Shoes/shoe5/Men Moccasin Slippers Fuzzy side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe5/Men Moccasin Slippers Fuzzy top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe5/Men Moccasin Slippers Fuzzy bottom.jpeg",
                    "shoes",
                    "mens",
                    "slippers",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe7 = new Product(
                    "House Slippers",
                    "Roxoni Men's Comfort house Slippers-Slip On Style -sizes 7 to 13 -style #1291",
                    13,
                    5.0f,
                    12,
                    4500f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe6/Men Comfort House Slipper display.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Shoes/shoe6/Men Comfort House Slipper side.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Shoes/shoe6/Men Comfort House Slipper bottom.jpeg",
                    "shoes",
                    "mens",
                    "Slippers",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe8 = new Product(
                    "waterproof Boots",
                    "Ozark trail Men's waterproof tall Chore hiking & hunting Boots",
                    71,
                    4.5f,
                    150,
                    6500f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe7/Men Waterprrof Tall boots display.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Shoes/shoe7/Men Waterprrof Tall boots side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe7/Men Waterprrof Tall boots top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe7/Men Waterprrof Tall boots bottom.jpeg",
                    "shoes",
                    "mens",
                    "boots",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe9 = new Product(
                    "Work Boots",
                    "Goodyear men's Maverik Steel toe Work boots",
                    3,
                    5.0f,
                    134,
                    0f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe8/Men Maverik Steel Toe Work Boots display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe8/Men Maverik Steel Toe Work Boots toe.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe8/Men Maverik Steel Toe Work Boots front.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe8/Men Maverik Steel Toe Work Boots top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe8/Men Maverik Steel Toe Work Boots bottom.jpeg",
                    "shoes",
                    "mens",
                    "boots",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe10 = new Product(
                    "Slide Sandals",
                    "AND1 Little & Big Boys Sport Slide Sandals,Sizes 13/1-6",
                    63,
                    5.0f,
                    170,
                    3500.99f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe9/Little & Boys Sport Slied Sandals display.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "shoes",
                    "sandals",
                    "boys",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe11 = new Product(
                    "Women sandals",
                    "Time and Tru Womens Braided two band sandals",
                    27,
                    4.5f,
                    43,
                    4000.00f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe10/Women Braided Two Band Sandals display.jpeg\n",
                    "Assets/images/All Products/Fashion/Shoes/shoe10/Women Braided Two Band Sandals back.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe10/Women Braided Two Band Sandals side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe10/Women Braided Two Band Sandals top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe10/Women Braided Two Band Sandals bottom.jpeg",
                    "shoes",
                    "womens",
                    "sandals",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe12 = new Product(
                    "Girls sandals",
                    "Minnie toddler girls light Up Sandal,sizes 7-12",
                    30,
                    5.0f,
                    57,
                    2500.88f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe11/Minnie Toddler Girls Light up sandal display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe11/Minnie Toddler Girls Light up sandal back.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Shoes/shoe11/Minnie Toddler Girls Light up sandal top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe11/Minnie Toddler Girls Light up sandal bottom.jpeg",
                    "shoes",
                    "girls",
                    "sandals",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe13 = new Product(
                    "Court Sneaker",
                    "Mark Ecko Women's Embellished Court Sneaker",
                    38,
                    4.0f,
                    46,
                    11500.77f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe12/Women Embellished Court Sneaker display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe12/Women Embellished Court Sneaker back.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe12/Women Embellished Court Sneaker side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe12/Women Embellished Court Sneaker top.jpeg",
                    "",
                    "shoes",
                    "women",
                    "Sneaker",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe14 = new Product(
                    "Club Sandal",
                    "Champion Men's Super Slide Club Sandal",
                    5,
                    5.0f,
                    63,
                    5500.5f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe13/Men super Slide Club sandal display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe13/Men super Slide Club sandal back.jpeg",
                    "",
                    "Assets/images/All Products/Fashion/Shoes/shoe13/Men super Slide Club sandal top.jpeg",
                    "",
                    "shoes",
                    "men",
                    "Sandals",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe15 = new Product(
                    "Toddler Athletic Sneakers",
                    "Mickey Mouse Toddler Boys License Athletic Sneakers,size 7-12",
                    14,
                    5.0f,
                    34,
                    4000f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe14/Mickey Mouse Toddler Boys Sneakers display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe14/Mickey Mouse Toddler Boys Sneakers  back.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe14/Mickey Mouse Toddler Boys Sneakers  side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe14/Mickey Mouse Toddler Boys Sneakers  top.jpeg",
                    "",
                    "shoes",
                    "boys",
                    "sneaker",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe16 = new Product(
                    "Low retro Sneakers",
                    "No Boundaries men's Low retro Sneakers",
                    56,
                    5.0f,
                    34,
                    14500f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe15/Men Low Retro Sneakers display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe15/Men Low Retro Sneakers back.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe15/Men Low Retro Sneakers side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe15/Men Low Retro Sneakers top.jpeg",
                    "",
                    "shoes",
                    "men",
                    "sneakers",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe17 = new Product(
                    "Flip Flop sandals",
                    "Mudd Women's pearl Studded jelly Flip Flop Sandal",
                    17,
                    4.5f,
                    41,
                    2500.5f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe16/Women Pearl Studded Jelly Flip Flop Sandal display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe16/Women Pearl Studded Jelly Flip Flop Sandal back.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe16/Women Pearl Studded Jelly Flip Flop Sandal side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe16/Women Pearl Studded Jelly Flip Flop Sandal top.jpeg",
                    "",
                    "shoes",
                    "women",
                    "sandal",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe18 = new Product(
                    "Girls Athletic Sneakers",
                    "Beverly Hills polo Clu  toddlers girls Slip on Athletic Sneaker,sizes 5-10",
                    13,
                    5.0f,
                    20,
                    6500f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe17/Toddler Girls Slip Sneakers display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe17/Toddler Girls Slip Sneakers back.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe17/Toddler Girls Slip Sneakers side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe17/Toddler Girls Slip Sneakers top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe17/Toddler Girls Slip Sneakers bottom.jpeg",
                    "shoes",
                    "girls",
                    "sneaker",
                    8L,
                    new Date(),
                    new Date()

            );
            Product shoe19 = new Product(
                    "Casual Court Sneaker",
                    "Josmo Casual Court Sneaker(Little Boys & Big Boys)",
                    34,
                    5.5f,
                    127,
                    16600.99f,
                    "Shoes",
                    "Assets/images/All Products/Fashion/Shoes/shoe18/Casual Court Sneaker display.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe18/Casual Court Sneaker back.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe18/Casual Court Sneaker side.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe18/Casual Court Sneaker top.jpeg",
                    "Assets/images/All Products/Fashion/Shoes/shoe18/Casual Court Sneaker bottom.jpeg",
                    "shoes",
                    "boys",
                    "Sneakers",
                    8L,
                    new Date(),
                    new Date()

            );


            /* watches*/
            Product watch1 = new Product(
                    "Rolex Gold",
                    "Rolex 18K Gold President 26mm Datejust 69178 VS Diamond Champagne Watch 1.38 CT",
                    3,
                    5.5f,
                    6,
                    1700500f,
                    "Watches",
                    "Assets/images/All Products/Fashion/Watch/watch1/Rolex 18k Gold President watch display.jpeg",
                    "Assets/images/All Products/Fashion/Watch/watch1/Rolex 18k Gold President watch incase.jpeg",
                    "Assets/images/All Products/Fashion/Watch/watch1/Rolex 18k Gold President watch upright.jpeg",
                    "",
                    "",
                    "watch",
                    "Rolex",
                    "mens",
                    9L,
                    new Date(),
                    new Date()

            );
            Product watch2 = new Product(
                    "Watch",
                    "",
                    3,
                    4.5f,
                    12,
                    130500f,
                    "Watches",
                    "Assets/images/All Products/Fashion/Watch/watch2/watch.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "watch",
                    "",
                    "",
                    9L,
                    new Date(),
                    new Date()

            );
            Product watch3 = new Product(
                    "Swiss Wrist Watch",
                    "",
                    10,
                    5.0f,
                    13,
                    250000f,
                    "Watches",
                    "Assets/images/All Products/Fashion/Watch/watch3/Swiss Wrist watch display.jpeg",
                    "Assets/images/All Products/Fashion/Watch/watch3/Swiss Wrist watch card.jpeg",
                    "Assets/images/All Products/Fashion/Watch/watch3/Swiss Wrist watch spec.jpeg",
                    "Assets/images/All Products/Fashion/Watch/watch3/Swiss Wrist watch view2.jpeg",
                    "",
                    "watch",
                    "wrist",
                    "swiss",
                    9L,
                    new Date(),
                    new Date()

            );


            /* video  games console */
            Product console1 = new Product(
                    "PlayStation 5",
                    "",
                    15,
                    5.0f,
                    46,
                    230600.99f,
                    "Video Game Console",
                    "Assets/images/All Products/Video Games/Consoles/playstation-5.png",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "playstation",
                    "ps",
                    10L,
                    new Date(),
                    new Date()

            );
            Product console2 = new Product(
                    "XBOX",
                    "",
                    23,
                    4.5f,
                    50,
                    125600f,
                    "Video Game Console",
                    "Assets/images/All Products/Video Games/Consoles/xbox.jpg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "XBOX",
                    "",
                    10L,
                    new Date(),
                    new Date()

            );
            Product console3 = new Product(
                    "XBOX serie1",
                    "",
                    34,
                    5.5f,
                    17,
                    250000.99f,
                    "Video Game Console",
                    "Assets/images/All Products/Video Games/Consoles/xbox serie 1.webp",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "XBOX",
                    "serie1",
                    10L,
                    new Date(),
                    new Date()

            );
            Product console4 = new Product(
                    "Super Console X",
                    "",
                    65,
                    4.5f,
                    77,
                    56000f,
                    "Video Game Console",
                    "Assets/images/All Products/Video Games/Consoles/Super Console X.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "Super",
                    "console x",
                    10L,
                    new Date(),
                    new Date()

            );
            Product console5 = new Product(
                    "PXP3",
                    "PXP3 2.7''",
                    120,
                    5.0f,
                    136,
                    45000f,
                    "Video Game Console",
                    "Assets/images/All Products/Video Games/Consoles/PXP3 2.7''.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "PXP3",
                    "",
                    10L,
                    new Date(),
                    new Date()

            );

            /* ps games*/
            Product psgame1 = new Product(
                    "Call of Duty Black Ops",
                    "Call of Duty black ops for ps4",
                    15,
                    5.0f,
                    100,
                    15600f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/Call of duty black ops ps4.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "ps4",
                    "Call of Duty",
                    11L,
                    new Date(),
                    new Date()

            );
            Product psgame2 = new Product(
                    "God of war",
                    "God of War ps4",
                    25,
                    5.0f,
                    34,
                    17000f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/God of war ps4.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "ps4",
                    "god of war",
                    11L,
                    new Date(),
                    new Date()

            );
            Product psgame3 = new Product(
                    "GTA V",
                    "",
                    5,
                    5.5f,
                    78,
                    20000f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/gta v-ps4.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "GTA V",
                    "ps4",
                    11L,
                    new Date(),
                    new Date()

            );
            Product psgame4 = new Product(
                    "Horizon ps4",
                    "",
                    25,
                    5.0f,
                    23,
                    15600f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/Horizon ps4.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "horizon",
                    "",
                    11L,
                    new Date(),
                    new Date()

            );
            Product psgame5 = new Product(
                    "Horizon ps5",
                    "",
                    13,
                    5.5f,
                    56,
                    25500f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/Horizon-ps5.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "Horizon",
                    "ps5",
                    11L,
                    new Date(),
                    new Date()

            );
            Product psgame6 = new Product(
                    "Jumanji",
                    "",
                    12,
                    4.5f,
                    13,
                    15000f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/Jumanji ps4.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "ps4",
                    "Jumanji",
                    11L,
                    new Date(),
                    new Date()

            );
            Product psgame7 = new Product(
                    "Red Dead Redemption 2",
                    "",
                    45,
                    5.0f,
                    58,
                    17500f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/Red Dead Redemption 2 ps4.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "ps4",
                    "Red dead redemption",
                    11L,
                    new Date(),
                    new Date()

            );
            Product psgame8 = new Product(
                    "Spider-man 4",
                    "",
                    4,
                    4.5f,
                    29,
                    14500f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/Spider-man ps4.png",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "ps4",
                    "Spider-man",
                    11L,
                    new Date(),
                    new Date()

            );
            Product psgame9 = new Product(
                    "Uncharted",
                    "",
                    16,
                    5.5f,
                    69,
                    19500f,
                    "PS Games",
                    "Assets/images/All Products/Video Games/PS games/Uncharted-ps5.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "ps5",
                    "Uncharted",
                    11L,
                    new Date(),
                    new Date()

            );


            /* xbox games*/
            Product xboxgame1 = new Product(
                    "NFS Payback",
                    "",
                    12,
                    5.0f,
                    46,
                    13500f,
                    "XBOX Games",
                    "Assets/images/All Products/Video Games/XBOX games/Need for speed payback xbox.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "xbox",
                    "NFS",
                    12L,
                    new Date(),
                    new Date()

            );
            Product xboxgame2 = new Product(
                    "NBA2K",
                    "",
                    17,
                    5.0f,
                    34,
                    14500f,
                    "XBOX Games",
                    "Assets/images/All Products/Video Games/XBOX games/NBA2K xbox.png",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "xbox",
                    "NBA2K",
                    12L,
                    new Date(),
                    new Date()

            );
            Product xboxgame3 = new Product(
                    "MineCraft",
                    "",
                    5,
                    5.0f,
                    67,
                    14500f,
                    "XBOX Games",
                    "Assets/images/All Products/Video Games/XBOX games/minecraft dungeons xbox.png",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "xbox",
                    "Minecraft",
                    12L,
                    new Date(),
                    new Date()

            );
            Product xboxgame4 = new Product(
                    "Hunting Simulator",
                    "",
                    9,
                    4.5f,
                    24,
                    13500f,
                    "XBOX Games",
                    "Assets/images/All Products/Video Games/XBOX games/Hunting simulator xbox.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "xbox",
                    "Hunting",
                    12L,
                    new Date(),
                    new Date()

            );
            Product xboxgame5 = new Product(
                    "BattleField",
                    "",
                    5,
                    5.0f,
                    46,
                    14500f,
                    "XBOX Games",
                    "Assets/images/All Products/Video Games/XBOX games/battlefield XBOX.jpeg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "xbox",
                    "battlefield",
                    12L,
                    new Date(),
                    new Date()

            );

            /*  virtual reality*/
            Product VR1 = new Product(
                    "VR",
                    "",
                    16,
                    5.0f,
                    50,
                    2500500f,
                    "VR",
                    "Assets/images/All Products/Video Games/virtual reality/vr black.jpg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "Vr",
                    "black",
                    13L,
                    new Date(),
                    new Date()

            );
            Product VR2 = new Product(
                    "VR",
                    "",
                    3,
                    5.5f,
                    67,
                    2900500.99f,
                    "VR",
                    "Assets/images/All Products/Video Games/virtual reality/vr white.jpg",
                    "",
                    "",
                    "",
                    "",
                    "games",
                    "Vr",
                    "white",
                    13L,
                    new Date(),
                    new Date()

            );


//            Product p1 = new Product(
//                    "",
//                    "",
//                    0,
//                    0,
//                    0,
//                    0f,
//                    "",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "",
//                    "",
//                    5L,
//                    new Date(),
//                    new Date()
//
//            );


            repository.saveAll(
                    List.of(pc1,pc2,pc3,pc4,pc5,pc6,pc7,pc8,pc9,
                            phone1,phone2,phone3,
                            tab1,tab2,tab3,
                            //tv,
                            sound1,sound2,sound3,sound4,sound5,sound6,
                            bag1,bag2,bag3,bag4,bag5,bag6,bag7,bag8,bag9,bag10,
                            cloth1,cloth2,cloth3,cloth4,cloth5,cloth6,cloth7,cloth8,cloth9,cloth10,cloth11,cloth12,cloth13,cloth14,cloth15,cloth16,cloth17,cloth18,cloth19,
                            shoe1,shoe2,shoe3,shoe4,shoe5,shoe6,shoe7,shoe8,shoe9,shoe10,shoe11,shoe12,shoe13,shoe14,shoe15,shoe16,shoe17,shoe18,shoe19,
                            watch1,watch2,watch3,
                            console1,console2,console3,console4,console5,
                            psgame1,psgame2,psgame3,psgame4,psgame5,psgame6,psgame7,psgame8,psgame9,
                            xboxgame1,xboxgame2,xboxgame3,xboxgame4,xboxgame5,
                            VR1,VR2
                             )
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
