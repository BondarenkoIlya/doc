package com.university.ilya.model;

import java.io.Serializable;
import java.util.List;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = -4646779893233570879L;

    private String name;

    private List<EmailAddress> emails;

    private List<Company> companies;

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
