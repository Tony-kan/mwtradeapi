//package com.example.mwtrade_web_api.Entities;
//
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import org.springframework.hateoas.RepresentationModel;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Getter
//@Setter
//@ToString
//@Entity
//@Table
//public class ProductCategory extends RepresentationModel<ProductCategory> {
//
//    @Id
//    @ApiModelProperty("The id for a specific Category")
//    private long categoryId;
//
//    @ApiModelProperty("The category Name")
//    private String categoryName;
//
//    @ApiModelProperty("The Image Representing a Category")
//    private String categoryImage;
//
//    @ApiModelProperty("The Short Description of the Category")
//    private String categoryDescription;
//
//    @ApiModelProperty("The Date The category is Created")
//    @Temporal(TemporalType.DATE)
//    private Date created_At;
//
//    @ApiModelProperty("The Date the Category is Modified")
//    @Temporal(TemporalType.DATE)
//    private Date modified_At;
////
////    @OneToMany(mappedBy = "productCategory")
////    private List<Product> products;
//
//    public ProductCategory() {
//    }
//
//    public ProductCategory(long categoryId,
//                           String categoryName,
//                           String categoryImage,
//                           String categoryDescription,
//                           Date created_At,
//                           Date modified_At
//                            ) {
//        this.categoryId = categoryId;
//        this.categoryName = categoryName;
//        this.categoryImage = categoryImage;
//        this.categoryDescription = categoryDescription;
//        this.created_At = created_At;
//        this.modified_At = modified_At;
//    }
//
//    public ProductCategory(String categoryName,
//                           String categoryImage,
//                           String categoryDescription,
//                           Date created_At,
//                           Date modified_At) {
//        this.categoryName = categoryName;
//        this.categoryImage = categoryImage;
//        this.categoryDescription = categoryDescription;
//        this.created_At = created_At;
//        this.modified_At = modified_At;
//    }
//
//}
