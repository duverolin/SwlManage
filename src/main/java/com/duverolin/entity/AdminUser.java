package com.duverolin.entity;


import java.io.Serializable;

/*
 * 管理员信息实体类
 * */
@SuppressWarnings("unused")
public class AdminUser implements Serializable {

    private int adminUserId;// 编号
    private String adminUserName;// 用户名
    private String adminPassword;// 登录密码
    private String adminUserImage;// 头像
    private int adminUserStatus;// 用户状态，默认1 ，注销0
    private String realName;// 真实姓名
    private String telePhone;// 联系电话

    public AdminUser(int adminUserId, String adminUserName, String adminPassword, String adminUserImage, int adminUserStatus, String realName, String telePhone) {
        this.adminUserId = adminUserId;
        this.adminUserName = adminUserName;
        this.adminPassword = adminPassword;
        this.adminUserImage = adminUserImage;
        this.adminUserStatus = adminUserStatus;
        this.realName = realName;
        this.telePhone = telePhone;
    }

    public AdminUser() {
        super();
    }

    public int getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(int adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminUserImage() {
        return adminUserImage;
    }

    public void setAdminUserImage(String adminUserImage) {
        this.adminUserImage = adminUserImage;
    }

    public int getAdminUserStatus() {
        return adminUserStatus;
    }

    public void setAdminUserStatus(int adminUserStatus) {
        this.adminUserStatus = adminUserStatus;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }
}
