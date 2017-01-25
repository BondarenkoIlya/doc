package com.university.ilya.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="company")
public class Company extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -9178250403951636372L;

    @Column(name="company_name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "company",cascade = CascadeType.REMOVE)
    private List<Agreement> agreements;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_info_id", insertable = false, updatable = false, nullable = false)
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
