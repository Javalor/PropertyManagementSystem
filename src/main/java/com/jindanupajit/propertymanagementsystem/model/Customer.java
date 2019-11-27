package com.jindanupajit.propertymanagementsystem.model;

import javax.persistence.*;

@Entity
public class Customer extends Person {

    @ManyToOne (
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    private Firm firm;

    @OneToOne (
        fetch = FetchType.LAZY,
        cascade = {CascadeType.PERSIST, CascadeType.MERGE},
        orphanRemoval = true
    )
    private StreetAddress streetAddress;

    public Customer() {
    }

    public Customer(Firm firm, StreetAddress streetAddress) {
        this.firm = firm;
        this.streetAddress = streetAddress;
    }

    public Customer(Name name, Firm firm, StreetAddress streetAddress) {
        super(name);
        this.firm = firm;
        this.streetAddress = streetAddress;
    }

    public Customer(String first, String middle, String last) {
        super(first, middle, last);
    }

    public Customer(String first, String middle, String last, Firm firm, StreetAddress streetAddress) {
        super(first, middle, last);
        this.firm = firm;
        this.streetAddress = streetAddress;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public StreetAddress getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(StreetAddress streetAddress) {
        this.streetAddress = streetAddress;
    }
}
