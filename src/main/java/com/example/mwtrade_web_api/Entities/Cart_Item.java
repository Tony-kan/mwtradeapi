package com.example.mwtrade_web_api.Entities;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
@AllArgsConstructor
public class Cart_Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartItemId;

    private Integer quantity;

    private Float price;

    @Temporal(TemporalType.DATE)
    private Date created_At;

    @Temporal(TemporalType.DATE)
    private Date modified_At;

@ManyToOne
@JoinColumn(name="Customer_id")
private Customer customer;


@ManyToOne
@JoinColumn(name="product_Id")
   private Product product;



    public Cart_Item() {
    }

    public Cart_Item(Integer quantity,
                     Float price,
                     Date created_At,
                     Date modified_At) {
        this.quantity = quantity;
        this.price = price;
        this.created_At = created_At;
        this.modified_At = modified_At;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getCartItemId() {
        return cartItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Cart_Item{" +
                "cartItemId=" + cartItemId +
                ", quantity=" + quantity +
                ", Price=" + price +
                ", created_At=" + created_At +
                ", modified_At=" + modified_At +
                '}';
    }
}
