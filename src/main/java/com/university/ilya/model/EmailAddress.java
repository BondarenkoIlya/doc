package com.university.ilya.model;

import java.io.Serializable;

public class EmailAddress implements Serializable {

    private static final long serialVersionUID = -1559861081811194748L;

    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
