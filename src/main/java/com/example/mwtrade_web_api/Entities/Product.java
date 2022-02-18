package com.example.mwtrade_web_api.Entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends RepresentationModel <Product> {
    @Id
    @SequenceGenerator(
            name="product_sequence",
            sequenceName ="product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    @ApiModelProperty("The product Id")
    private Long productId;

    @ApiModelProperty("The Name of the Product")
    private String productName;

    @ApiModelProperty("The short Description of the Product")
    private String shortDescription;

    @ApiModelProperty("Quantity of Product Available in Stock")
    private Integer in_Stock;

    @ApiModelProperty("Price of the Product")
    private float productPrice;

    @ApiModelProperty("Avarage rating by Customers")
    private float avgRating;

    @ApiModelProperty("Brand Name of the Product")
    private String categoryName;

    @ApiModelProperty("Main image of the Product ")
    private String mainImage;

    @ApiModelProperty("Back Image of the Product")
    private String backImage;

    @ApiModelProperty("Side Image of the Product")
    private String sideImage;

    @ApiModelProperty("Top image of the Product")
    private String topImage;

    @ApiModelProperty("Buttom image of the Product")
    private String bottomImage;

    @ApiModelProperty("Tag 1 of the Product")
    private String tag1;

    @ApiModelProperty("Tag 2 of the Product")
    private String tag2;

    @ApiModelProperty("Tag 3 of the Product")
    private String tag3;

    @ApiModelProperty("categoryId")
    private Long categoryId;

    @ApiModelProperty("The date when the product is uploaded online")
    @Temporal(TemporalType.DATE)
    private Date created_At;

    @ApiModelProperty("The date when the Products details are updated")
    @Temporal(TemporalType.DATE)
    private Date modified_at;


    @ManyToOne
    @JoinColumn(name="Brand_id")
    private Brand brand;

//    @ManyToOne
//    @JoinColumn(name="Category_id")
//    private ProductCategory productCategory;

    @ManyToMany(mappedBy = "products")
    private List<Seller> sellers;

    @OneToMany(mappedBy = "product")
    private List<Cart_Item> cart_item;

    public Product(Long productId) {
        this.productId = productId;
    }

    public Product( String productName, String shortDescription,
                    Integer in_Stock,
                   float avgRating,float productPrice, String categoryName, String mainImage,
                   String backImage, String sideImage,String topImage, String bottomImage,
                   String tag1,String tag2,String tag3,
                   Long categoryId, Date created_At, Date modified_at) {

        this.productName = productName;
        this.shortDescription = shortDescription;
        this.in_Stock = in_Stock;
        this.avgRating = avgRating;
        this.productPrice=productPrice;
        this.categoryName = categoryName;
        this.mainImage = mainImage;
        this.backImage = backImage;
        this.sideImage = sideImage;
        this.topImage=topImage;
        this.bottomImage = bottomImage;
        this.tag1=tag1;
        this.tag2=tag2;
        this.tag3=tag3;
        this.categoryId=categoryId;
        this.created_At = created_At;
        this.modified_at = modified_at;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", in_Stock=" + in_Stock +
                ", avgRating=" + avgRating +
                ", brandName='" + categoryName + '\'' +
                ", mainImage='" + mainImage + '\'' +
                ", reviewCount=" + categoryId +
                '}';
    }


}
