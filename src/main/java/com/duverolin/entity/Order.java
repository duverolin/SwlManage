package com.duverolin.entity;

import java.io.Serializable;

/*
订单实体表
 */
public class Order implements Serializable {
    private int orderId;//主键订单Id
    private int nickId;//用户Id
    private int orderDetailsId;//订单详情

    public Order(int orderId, int nickId, int orderDetailsId) {
        this.orderId = orderId;
        this.nickId = nickId;
        this.orderDetailsId = orderDetailsId;
    }

    public Order() {
        super();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getNickId() {
        return nickId;
    }

    public void setNickId(int nickId) {
        this.nickId = nickId;
    }

    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }
}
