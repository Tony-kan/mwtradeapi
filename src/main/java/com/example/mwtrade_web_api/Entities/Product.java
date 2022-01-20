package com.example.mwtrade_web_api.Entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table
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

    @ApiModelProperty("Full Description of the Product")
    private String fullDescription;

    @ApiModelProperty("Quantity of Product Available in Stock")
    private Integer in_Stock;

    @ApiModelProperty("Discount percentage for Purchase")
    private Integer discountPercent;

    @ApiModelProperty("Price of the Product")
    private float productPrice;

    @ApiModelProperty("Avarage rating by Customers")
    private float avgRating;

    @ApiModelProperty("Brand Name of the Product")
    private String brandName;

    @ApiModelProperty("Main image of the Product ")
    private String mainImage;

    @ApiModelProperty("Back Image of the Product")
    private String backImage;

    @ApiModelProperty("Side Image of the Product")
    private String sideImage;

    @ApiModelProperty("Buttom image of the Product")
    private String bottomImage;

    @ApiModelProperty("review Count")
    private Integer reviewCount;

    @ApiModelProperty("The date when the product is uploaded online")
    @Temporal(TemporalType.DATE)
    private Date created_At;

    @ApiModelProperty("The date when the Products details are updated")
    @Temporal(TemporalType.DATE)
    private Date modified_at;


    @ManyToOne
    @JoinColumn(name="Brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name="Category_id")
    private ProductCategory productCategory;

    @ManyToMany(mappedBy = "products")
    private List<Seller> sellers;

    @OneToMany(mappedBy = "product")
    private List<Cart_Item> cart_item;

    public Product(Long productId) {
        this.productId = productId;
    }

    public Product( String productName, String shortDescription,
                   String fullDescription, Integer in_Stock, Integer discountPercent,
                   float avgRating,float productPrice, String brandName, String mainImage,
                   String backImage, String sideImage, String bottomImage,
                   Integer reviewCount, Date created_At, Date modified_at) {

        this.productId = productId;
        this.productName = productName;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.in_Stock = in_Stock;
        this.discountPercent = discountPercent;
        this.avgRating = avgRating;
        this.productPrice=productPrice;
        this.brandName = brandName;
        this.mainImage = mainImage;
        this.backImage = backImage;
        this.sideImage = sideImage;
        this.bottomImage = bottomImage;
        this.reviewCount = reviewCount;
        this.created_At = created_At;
        this.modified_at = modified_at;
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public Integer getIn_Stock() {
        return in_Stock;
    }

    public void setIn_Stock(Integer in_Stock) {
        this.in_Stock = in_Stock;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public float getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(float avgRating) {
        this.avgRating = avgRating;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getBackImage() {
        return backImage;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    public String getSideImage() {
        return sideImage;
    }

    public void setSideImage(String sideImage) {
        this.sideImage = sideImage;
    }

    public String getBottomImage() {
        return bottomImage;
    }

    public void setBottomImage(String bottomImage) {
        this.bottomImage = bottomImage;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }

    public Date getModified_at() {
        return modified_at;
    }

    public void setModified_at(Date modified_at) {
        this.modified_at = modified_at;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", in_Stock=" + in_Stock +
                ", discountPercent=" + discountPercent +
                ", avgRating=" + avgRating +
                ", brandName='" + brandName + '\'' +
                ", mainImage='" + mainImage + '\'' +
                ", reviewCount=" + reviewCount +
                '}';
    }


}
