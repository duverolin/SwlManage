package com.duverolin.entity;

import java.io.Serializable;

/*
商品类别实体类
 */
public class CommodityType implements Serializable {
    private int commodityTypeId;//主键Id
    private String commodityTypeName;//类别名称

    public CommodityType(int commodityTypeId, String commodityTypeName) {
        this.commodityTypeId = commodityTypeId;
        this.commodityTypeName = commodityTypeName;
    }

    public CommodityType() {
        super();
    }

    public int getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(int commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName;
    }
}
