package com.university.ilya.model;

import com.university.ilya.model.converters.LocalDateConverter;

import javax.persistence.*;
import java.io.InputStream;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="agreement")
public class Agreement extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -411275891663405450L;

    @Column(name = "conclusion_date")
    @Convert(converter = LocalDateConverter.class)
    private LocalDate conclusionDate;

    @Column(name = "expiry_date")
    @Convert(converter = LocalDateConverter.class)
    private LocalDate expiryDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", insertable = false, updatable = false, nullable = false)
    private Company company;

    @Column(name="document")
    private byte[] document;

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }

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
