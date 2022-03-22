package com.duverolin.entity;

import java.io.Serializable;

/*
商品评论实体类
 */
public class CommodityReview implements Serializable {
    private int commodityReviewId;//主键Id
    private int nickId;//用户Id
    private int commodityId;//商品Id
    private String commodityReviewContent;//评论内容
    private String commodityReviewImage;//评论图片
    private String commodityReviewTime;//评论时间

    public CommodityReview(int commodityReviewId, int nickId, int commodityId, String commodityReviewContent, String commodityReviewImage, String commodityReviewTime) {
        this.commodityReviewId = commodityReviewId;
        this.nickId = nickId;
        this.commodityId = commodityId;
        this.commodityReviewContent = commodityReviewContent;
        this.commodityReviewImage = commodityReviewImage;
        this.commodityReviewTime = commodityReviewTime;
    }

    public CommodityReview() {
        super();
    }

    public int getCommodityReviewId() {
        return commodityReviewId;
    }

    public void setCommodityReviewId(int commodityReviewId) {
        this.commodityReviewId = commodityReviewId;
    }

    public int getNickId() {
        return nickId;
    }

    public void setNickId(int nickId) {
        this.nickId = nickId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityReviewContent() {
        return commodityReviewContent;
    }

    public void setCommodityReviewContent(String commodityReviewContent) {
        this.commodityReviewContent = commodityReviewContent;
    }

    public String getCommodityReviewImage() {
        return commodityReviewImage;
    }

    public void setCommodityReviewImage(String commodityReviewImage) {
        this.commodityReviewImage = commodityReviewImage;
    }

    public String getCommodityReviewTime() {
        return commodityReviewTime;
    }

    public void setCommodityReviewTime(String commodityReviewTime) {
        this.commodityReviewTime = commodityReviewTime;
    }
}
