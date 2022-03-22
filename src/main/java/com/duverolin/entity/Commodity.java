package com.duverolin.entity;

import java.io.Serializable;

/*
 * 商品实体类
 * */
public class Commodity implements Serializable {
    private int commodityId;//主键商品Id
    private String seller;//售卖方
    private String commodityName;//商品名称
    private double oldPrice;//原价
    private double newPrice;//现价
    private int commodityTypeId;//所属商品类别Id
    private int commodityImageId;//商品图片Id
    private int saleNumber;//销量
    private int commodityReviewNumber;//评论数量
    private int commodityStock;//商品库存
    private String commodityShortDesc;//商品简介
    private String commodityDesc;//商品详细信息

    public Commodity(int commodityId, String seller, String commodityName, double oldPrice, double newPrice, int commodityTypeId, int commodityImageId, int saleNumber, int commodityReviewNumber, int commodityStock, String commodityShortDesc, String commodityDesc) {
        this.commodityId = commodityId;
        this.seller = seller;
        this.commodityName = commodityName;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.commodityTypeId = commodityTypeId;
        this.commodityImageId = commodityImageId;
        this.saleNumber = saleNumber;
        this.commodityReviewNumber = commodityReviewNumber;
        this.commodityStock = commodityStock;
        this.commodityShortDesc = commodityShortDesc;
        this.commodityDesc = commodityDesc;
    }

    public Commodity() {
        super();
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public int getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(int commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public int getCommodityImageId() {
        return commodityImageId;
    }

    public void setCommodityImageId(int commodityImageId) {
        this.commodityImageId = commodityImageId;
    }

    public int getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }

    public int getCommodityReviewNumber() {
        return commodityReviewNumber;
    }

    public void setCommodityReviewNumber(int commodityReviewNumber) {
        this.commodityReviewNumber = commodityReviewNumber;
    }

    public int getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(int commodityStock) {
        this.commodityStock = commodityStock;
    }

    public String getCommodityShortDesc() {
        return commodityShortDesc;
    }

    public void setCommodityShortDesc(String commodityShortDesc) {
        this.commodityShortDesc = commodityShortDesc;
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }
}
