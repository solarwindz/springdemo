package com.springproject.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable{
    private int loginLogId;//登陆的id

    private int userId;//用户ID

    private String ip;//用户登陆的IP

    private Date loginDate;//用户登陆的时间

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
