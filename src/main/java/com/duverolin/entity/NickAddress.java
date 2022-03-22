package com.duverolin.entity;

import java.io.Serializable;

/*
用户地址实体类
 */
public class NickAddress implements Serializable {
    private int nickAddressId;//主键地址Id
    private int nickId;//用户Id
    private String consignee;//收货人
    private String telePhone;//手机号
    private String province;//省份
    private String city;//城市
    private String area;//区域
    private String details;//详细地址
    private int isDefault;//是否为默认地址 1.默认

    public NickAddress(int nickAddressId, int nickId, String consignee, String telePhone, String province, String city, String area, String details, int isDefault) {
        this.nickAddressId = nickAddressId;
        this.nickId = nickId;
        this.consignee = consignee;
        this.telePhone = telePhone;
        this.province = province;
        this.city = city;
        this.area = area;
        this.details = details;
        this.isDefault = isDefault;
    }

    public NickAddress() {
        super();
    }

    public int getNickAddressId() {
        return nickAddressId;
    }

    public void setNickAddressId(int nickAddressId) {
        this.nickAddressId = nickAddressId;
    }

    public int getNickId() {
        return nickId;
    }

    public void setNickId(int nickId) {
        this.nickId = nickId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }
}
