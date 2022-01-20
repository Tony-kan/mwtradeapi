package com.example.mwtrade_web_api.Entities;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Customer extends RepresentationModel<Customer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("The unique id For a specific Customer")
    private Long customerId;

    @ApiModelProperty("First Name of the Customer")
    private String firstName;

    @ApiModelProperty("Last of the Customer")
    private String lastName;

    @ApiModelProperty("The Email Address of the Customer")
    private String email;

    @ApiModelProperty("The Customer's UserName")
    private String userName;

    @ApiModelProperty("The password of the customer")
    private String passWord;

    @ApiModelProperty("The Customer mobile contact info")
    private String mobileNo;

    @ApiModelProperty("Address of the customer")
    private String address1;

    @ApiModelProperty("second address of the customer")
    private String address2;

    @ApiModelProperty("The region where customer lives")
    private String region;

    @ApiModelProperty("District of the customer")
    private String district;

    @ApiModelProperty("Postalcode")
    private String postalCode;

    @ApiModelProperty("date when the customer account is created")
    @Temporal(TemporalType.DATE)
    private Date created_At;

    @ApiModelProperty("Date when the customer account is edited")
    @Temporal(TemporalType.DATE)
    private Date modified_At;

    @OneToMany(mappedBy = "buyer")
    private List<Order_Table> order;

   @OneToMany(mappedBy = "customer")
    private List<Cart_Item> cart_item;

    public Customer() {
    }

    public Customer(String firstName,
                    String lastName,
                    String email,
                    String userName,
                    String passWord,
                    String mobileNo,
                    String address1,
                    String address2,
                    String region,
                    String district,
                    String postalCode,
                    Date created_At,
                    Date modified_At) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;
        this.mobileNo = mobileNo;
        this.address1 = address1;
        this.address2 = address2;
        this.region = region;
        this.district = district;
        this.postalCode = postalCode;
        this.created_At = created_At;
        this.modified_At = modified_At;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }

    public Date getModified_At() {
        return modified_At;
    }

    public void setModified_At(Date modified_At) {
        this.modified_At = modified_At;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", created_At=" + created_At +
                ", modified_At=" + modified_At +
                '}';
    }


}
