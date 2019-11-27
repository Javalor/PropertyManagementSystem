package com.jindanupajit.propertymanagementsystem.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="address", initialValue=1, allocationSize=1)
public class StreetAddress {

    @Id
    @GeneratedValue(generator = "address", strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(length = 70)
    private String street;

    @Column(length = 20)
    private String unit;

    @Column(length = 70)
    private String line2;

    @Column(length = 30)
    private String city;

    @Column(length = 30)
    private String state;

    @Column(length = 10)
    private String zip;

    public StreetAddress() {
    }

    public StreetAddress(String street, String unit, String line2, String city, String state, String zip) {
        this.street = street;
        this.unit = unit;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(street!=null?street:"");
        sb.append(unit!=null?" "+unit:"");
        sb.append(line2!=null?", "+line2:"");
        sb.append(city!=null?", "+city:"");
        sb.append(state!=null?", "+state:"");
        sb.append(zip!=null?" "+zip:"");

        return sb.toString().replace("^,","").trim();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
