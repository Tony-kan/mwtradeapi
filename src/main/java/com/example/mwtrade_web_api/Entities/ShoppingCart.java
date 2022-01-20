package com.example.mwtrade_web_api.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
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

    public ShoppingCart(Date date,
                        Integer itemsNumber,
                        double totalPrice) {
        this.date = date;
        this.itemsNumber = itemsNumber;
        this.totalPrice = totalPrice;
    }

    public Long getShoppingcartId() {
        return shoppingcartId;
    }

    public void setShoppingcartId(Long shopingcartId) {
        this.shoppingcartId = shopingcartId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Double getTotalPrice() {
        Double sum = 0.0;
        for(Cart_Item item : this.items) {
            sum = sum + item.getProduct().getProductPrice()*item.getQuantity();
        }
        return sum;
    }
    public Integer getItemsNumber() {
        return this.items.size();
    }


    public List<Cart_Item> getItems() {
        return items;
    }

    public void setItems(List<Cart_Item> items) {
        this.items = items;
    }
}
