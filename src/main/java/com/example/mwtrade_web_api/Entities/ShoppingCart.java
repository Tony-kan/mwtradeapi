package com.example.mwtrade_web_api.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shoppingcartId;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Transient
    private Integer itemsNumber;

    @Transient
    private double totalPrice;

    @OneToMany
    private List<Cart_Item> items;

    public ShoppingCart(Integer itemsNumber,
                        double totalPrice,
                        List<Cart_Item> items) {
        this.itemsNumber = itemsNumber;
        this.totalPrice = totalPrice;
        this.items = items;
    }

    public ShoppingCart( List<Cart_Item> items,Date date) {
        this.date = date;
        this.items = items;
    }

    public ShoppingCart(Date date,
                        Integer itemsNumber,
                        double totalPrice) {
        this.date = date;
        this.itemsNumber = itemsNumber;
        this.totalPrice = totalPrice;
    }



    public void setDate(Date date) {
        this.date = date;
    }
    public Double getTotalPrice() {
        Double sum = 0.0;
        for(Cart_Item item : this.items) {
            sum = sum + item.getProduct().getPrice()*item.getQuantity();
        }
        return sum;
    }
    public Integer getItemsNumber() {
        return this.items.size();
    }


}
