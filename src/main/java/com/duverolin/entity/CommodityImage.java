package com.duverolin.entity;

import java.io.Serializable;

/*
 * 商品图片实体类
 */
public class CommodityImage implements Serializable {
    private int commodityImageId;
    private String commodityImage;

    public CommodityImage(int commodityImageId, String commodityImage) {
        this.commodityImageId = commodityImageId;
        this.commodityImage = commodityImage;
    }

    public CommodityImage() {
        super();
    }

    public int getCommodityImageId() {
        return commodityImageId;
    }

    public void setCommodityImageId(int commodityImageId) {
        this.commodityImageId = commodityImageId;
    }

    public String getCommodityImage() {
        return commodityImage;
    }

    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage;
    }
}
