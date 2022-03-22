package com.duverolin.entity;

import java.io.Serializable;

/*
订单详情实体类
 */
public class OrderDetails implements Serializable {
    private int orderDetailsId;//主键订单详情Id
    private int commodityId;//商品Id
    private int dealPrice;//成交价格
    private int orderNums;//购买数量
    private String orderRemark;//订单备注
    private int orderStatus;//订单状态
    private String createTime;//创建时间
    private String paymentTime;//支付时间
    private String dealTime;//成交时间

    public OrderDetails(int orderDetailsId, int commodityId, int dealPrice, int orderNums, String orderRemark, int orderStatus, String createTime, String paymentTime, String dealTime) {
        this.orderDetailsId = orderDetailsId;
        this.commodityId = commodityId;
        this.dealPrice = dealPrice;
        this.orderNums = orderNums;
        this.orderRemark = orderRemark;
        this.orderStatus = orderStatus;
        this.createTime = createTime;
        this.paymentTime = paymentTime;
        this.dealTime = dealTime;
    }

    public OrderDetails() {
        super();
    }

    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(int dealPrice) {
        this.dealPrice = dealPrice;
    }

    public int getOrderNums() {
        return orderNums;
    }

    public void setOrderNums(int orderNums) {
        this.orderNums = orderNums;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }
}
