package com.university.ilya.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -4646779893233570879L;

    @Column(name="name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user_info" ,cascade = CascadeType.REMOVE)
    private List<EmailAddress> emails;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user_info" ,cascade = CascadeType.REMOVE)
    private List<Company> companies;

    @OneToOne(mappedBy = "user_info")
    @PrimaryKeyJoinColumn
    private User user;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmailAddress> getEmails() {
        return emails;
    }

    public void setEmails(List<EmailAddress> emails) {
        this.emails = emails;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
