package com.example.mwtrade_web_api.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Order_Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Integer orderNo;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    private float orderTotal;

    @Temporal(TemporalType.DATE)
    private Date shippingDate;

    private String isDelivered;

//    @ManyToOne
//    @JoinColumn(name="Customer_id")
//    private Customer buyer;

    @OneToOne(mappedBy = "orderT")
    private Order_Details order_details;



    public Order_Table() {
    }

    public Order_Table(Integer orderNo,
                       Date orderDate,
                       float orderTotal,
                       Date shippingDate,
                       String isDelivered) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
        this.shippingDate = shippingDate;
        this.isDelivered = isDelivered;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(float orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(String isDelivered) {
        this.isDelivered = isDelivered;
    }

    public long getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order_Table{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", orderDate=" + orderDate +
                ", orderTotal=" + orderTotal +
               // ", customerId=" + customerId +
                ", shippingDate=" + shippingDate +
                ", isDelivered='" + isDelivered + '\'' +
                '}';
    }
}
