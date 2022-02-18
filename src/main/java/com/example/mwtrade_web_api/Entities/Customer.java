package com.example.mwtrade_web_api.Entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Setter
@Getter
public class Customer {

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

//    @ApiModelProperty("The Customer's UserName")
//    private String userName;

    @ApiModelProperty("The password of the customer")
    private String passWord;

//    @ApiModelProperty("The Customer mobile contact info")
//    private String mobileNo;
//
//    @ApiModelProperty("Address of the customer")
//    private String address1;
//
//    @ApiModelProperty("second address of the customer")
//    private String address2;
//
//    @ApiModelProperty("The region where customer lives")
//    private String region;
//
//    @ApiModelProperty("District of the customer")
//    private String district;
//
//    @ApiModelProperty("Postalcode")
//    private String postalCode;

    @ApiModelProperty("date when the customer account is created")
    @Temporal(TemporalType.DATE)
    private Date created_At;

    @ApiModelProperty("Date when the customer account is edited")
    @Temporal(TemporalType.DATE)
    private Date modified_At;

//    @OneToMany(mappedBy = "buyer")
//    private List<Order_Table> order;

//   @OneToMany(mappedBy = "customer")
//    private List<Cart_Item> cart_item;

    public Customer() {
    }

    public Customer(String firstName,
                    String lastName,
                    String email,
                    String passWord,
                    Date created_At,
                    Date modified_At) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
        this.created_At = created_At;
        this.modified_At = modified_At;
    }

}
