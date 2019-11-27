package com.jindanupajit.propertymanagementsystem.model;

import javax.persistence.*;


@MappedSuperclass
@SequenceGenerator(name="legalentity", initialValue=1, allocationSize=1)
public abstract class LegalEntity {

    @Id
    @GeneratedValue(generator = "legalentity", strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    @OneToOne (
        fetch = FetchType.LAZY,
        cascade = {CascadeType.PERSIST, CascadeType.MERGE},
        orphanRemoval = true
    )
    private StreetAddress streetAddress;

    public LegalEntity() {
    }

    public LegalEntity(String name, StreetAddress streetAddress) {
        this.name = name;
        this.streetAddress = streetAddress;
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

    public StreetAddress getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(StreetAddress streetAddress) {
        this.streetAddress = streetAddress;
    }
}
