package com.duverolin.entity;

import java.io.Serializable;

/*
意见反馈实体类
 */
public class Opinion implements Serializable {
    private int opinionId;//主键Id
    private String opinionContent;//意见内容
    private int nickId;//用户Id

    public Opinion(int opinionId, String opinionContent, int nickId) {
        this.opinionId = opinionId;
        this.opinionContent = opinionContent;
        this.nickId = nickId;
    }

    public Opinion() {
        super();
    }

    public int getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(int opinionId) {
        this.opinionId = opinionId;
    }

    public String getOpinionContent() {
        return opinionContent;
    }

    public void setOpinionContent(String opinionContent) {
        this.opinionContent = opinionContent;
    }

    public int getNickId() {
        return nickId;
    }

    public void setNickId(int nickId) {
        this.nickId = nickId;
    }
}
