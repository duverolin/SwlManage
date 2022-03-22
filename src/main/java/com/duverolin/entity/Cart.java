package com.duverolin.entity;

import java.io.Serializable;

/*
 * 购物车实体类
 * */
public class Cart implements Serializable {

    private int cartId;//主键ID
    private int nickId;//外键用户ID
    private int commodityNumber;//商品数量

    public Cart(int cartId, int nickId, int commodityNumber) {
        this.cartId = cartId;
        this.nickId = nickId;
        this.commodityNumber = commodityNumber;
    }

    public Cart() {
        super();
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getNickId() {
        return nickId;
    }

    public void setNickId(int nickId) {
        this.nickId = nickId;
    }

    public int getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(int commodityNumber) {
        this.commodityNumber = commodityNumber;
    }
}
