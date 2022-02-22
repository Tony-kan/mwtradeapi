package com.example.mwtrade_web_api.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
@Getter
@Setter
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
@JoinColumn(name="id")
   private Product product;



    public Cart_Item() {
    }

    public Cart_Item(Integer quantity, Customer customer, Product product, Date created_At) {
        this.quantity = quantity;
        this.created_At = created_At;
        this.customer = customer;
        this.product = product;
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
