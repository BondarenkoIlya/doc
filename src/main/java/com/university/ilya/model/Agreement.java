package com.university.ilya.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Agreement implements Serializable {

    private static final long serialVersionUID = -411275891663405450L;

    private LocalDate conclusionDate;

    private LocalDate expiryDate;

    private Company company;


    public LocalDate getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(LocalDate conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
