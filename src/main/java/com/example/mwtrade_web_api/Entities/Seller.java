package com.example.mwtrade_web_api.Entities;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Seller {

    @Id
    @GeneratedValue
    private Long sellerId;

    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String passWord;
    private String mobileNo;
    private String address;
    private String region;
    private String district;
    private String postalCode;

    @Temporal(TemporalType.DATE)
    private Date created_At;

    @Temporal(TemporalType.DATE)
    private Date modified_At;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="Seller_product",
    joinColumns = @JoinColumn(name="Product_id",referencedColumnName ="sellerId" ),
    inverseJoinColumns = @JoinColumn(name="Seller_id",referencedColumnName = "productId"))
    private List<Product> products;


    public Seller() {
    }

    public Seller(String firstName,
                  String lastName,
                  String email,
                  String userName,
                  String passWord,
                  String mobileNo,
                  String address,
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
        this.address = address;
        this.region = region;
        this.district = district;
        this.postalCode = postalCode;
        this.created_At = created_At;
        this.modified_At = modified_At;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Long getSellerId() {
        return sellerId;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address='" + address + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", created_At=" + created_At +
                ", modified_At=" + modified_At +
                '}';
    }
}
