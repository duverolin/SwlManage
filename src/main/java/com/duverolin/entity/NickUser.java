package com.duverolin.entity;

import java.io.Serializable;

public class NickUser implements Serializable {
    private int nickId;//用户ID
    private String nickLoginName;//登录账号
    private String nickName;//用户昵称
    private String nickPassword;//登录密码
    private String nickImg;//用户头像
    private String nickRealName;//用户真名
    private String nickTelephone;//电话号码
    private int nickSex;//性别 1.男,0.女
    private String nickBrithday;//生日
    private String nickIntro;//个性签名
    private int nickScore;//用户积分
    private String nickRegisterTime;//注册时间
    private int nickStatus;//账号状态 1.使用中,0.封禁

    public NickUser() {
        super();
    }

    public NickUser(int nickId, String nickLoginName, String nickName, String nickPassword, String nickImg, String nickRealName, String nickTelephone, int nickSex, String nickBrithday, String nickIntro, int nickScore, String nickRegisterTime, int nickStatus) {
        this.nickId = nickId;
        this.nickLoginName = nickLoginName;
        this.nickName = nickName;
        this.nickPassword = nickPassword;
        this.nickImg = nickImg;
        this.nickRealName = nickRealName;
        this.nickTelephone = nickTelephone;
        this.nickSex = nickSex;
        this.nickBrithday = nickBrithday;
        this.nickIntro = nickIntro;
        this.nickScore = nickScore;
        this.nickRegisterTime = nickRegisterTime;
        this.nickStatus = nickStatus;
    }

    public int getNickId() {
        return nickId;
    }

    public void setNickId(int nickId) {
        this.nickId = nickId;
    }

    public String getNickLoginName() {
        return nickLoginName;
    }

    public void setNickLoginName(String nickLoginName) {
        this.nickLoginName = nickLoginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickPassword() {
        return nickPassword;
    }

    public void setNickPassword(String nickPassword) {
        this.nickPassword = nickPassword;
    }

    public String getNickImg() {
        return nickImg;
    }

    public void setNickImg(String nickImg) {
        this.nickImg = nickImg;
    }

    public String getNickRealName() {
        return nickRealName;
    }

    public void setNickRealName(String nickRealName) {
        this.nickRealName = nickRealName;
    }

    public String getNickTelephone() {
        return nickTelephone;
    }

    public void setNickTelephone(String nickTelephone) {
        this.nickTelephone = nickTelephone;
    }

    public int getNickSex() {
        return nickSex;
    }

    public void setNickSex(int nickSex) {
        this.nickSex = nickSex;
    }

    public String getNickBrithday() {
        return nickBrithday;
    }

    public void setNickBrithday(String nickBrithday) {
        this.nickBrithday = nickBrithday;
    }

    public String getNickIntro() {
        return nickIntro;
    }

    public void setNickIntro(String nickIntro) {
        this.nickIntro = nickIntro;
    }

    public int getNickScore() {
        return nickScore;
    }

    public void setNickScore(int nickScore) {
        this.nickScore = nickScore;
    }

    public String getNickRegisterTime() {
        return nickRegisterTime;
    }

    public void setNickRegisterTime(String nickRegisterTime) {
        this.nickRegisterTime = nickRegisterTime;
    }

    public int getNickStatus() {
        return nickStatus;
    }

    public void setNickStatus(int nickStatus) {
        this.nickStatus = nickStatus;
    }
}
