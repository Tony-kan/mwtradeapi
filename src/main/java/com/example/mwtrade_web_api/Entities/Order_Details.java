package com.example.mwtrade_web_api.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Order_Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailsId;
    private Integer productQuantity;
    private float subTotal;

   @OneToMany(cascade = CascadeType.ALL)
    private List<Product> product;

    @OneToOne
    @JoinColumn(name="Order_id")
    private Order_Table orderT;



    public Order_Details() {
    }

    public Order_Details(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public long getOrderDetailsId() {
        return orderDetailsId;
    }


    public Integer getProductQuantity() {
        return productQuantity;
    }


    public float getSubTotal() {
        return subTotal;
    }

    @Override
    public String toString() {
        return "Order_Details{" +
                "orderDetailsId=" + orderDetailsId +
               // ", productId=" + productId +
                ", productQuantity=" + productQuantity +
                ", subTotal=" + subTotal +
                '}';
    }
}
