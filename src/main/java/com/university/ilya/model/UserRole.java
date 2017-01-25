package com.university.ilya.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserRole implements Serializable {

    private static final long serialVersionUID = 6586868545222530783L;

    private String role;

    private Set<User> users = new HashSet<>();

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
