package com.jindanupajit.propertymanagementsystem.model;

import javax.persistence.*;

@Entity
@MappedSuperclass
@SequenceGenerator(name="firm", initialValue=1, allocationSize=1)
public class Firm {

    @Id
    @GeneratedValue(generator = "firm", strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    @OneToOne (
        fetch = FetchType.LAZY,
        cascade = {CascadeType.PERSIST, CascadeType.MERGE},
        orphanRemoval = true
    )
    private Address address;

    public Firm() {
    }

    public Firm(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
