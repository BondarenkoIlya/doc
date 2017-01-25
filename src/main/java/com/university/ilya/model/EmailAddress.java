package com.university.ilya.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="email_address")
public class EmailAddress extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -1559861081811194748L;

    @Column(name="recipient_email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "user_info_id", insertable = false, updatable = false, nullable = false)
    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
