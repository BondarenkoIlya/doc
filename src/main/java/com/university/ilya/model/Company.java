package com.university.ilya.model;

import java.io.Serializable;
import java.util.List;

public class Company implements Serializable {

    private static final long serialVersionUID = -9178250403951636372L;

    private String name;

    private List<Agreement> agreements;

    private UserInfo owner;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Agreement> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
    }

    public UserInfo getOwner() {
        return owner;
    }

    public void setOwner(UserInfo owner) {
        this.owner = owner;
    }
}
