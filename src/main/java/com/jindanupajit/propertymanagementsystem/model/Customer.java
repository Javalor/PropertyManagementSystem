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
    private Address address;

    public Customer() {
    }

    public Customer(Firm firm, Address address) {
        this.firm = firm;
        this.address = address;
    }

    public Customer(Name name, Firm firm, Address address) {
        super(name);
        this.firm = firm;
        this.address = address;
    }

    public Customer(String first, String middle, String last) {
        super(first, middle, last);
    }

    public Customer(String first, String middle, String last, Firm firm, Address address) {
        super(first, middle, last);
        this.firm = firm;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
