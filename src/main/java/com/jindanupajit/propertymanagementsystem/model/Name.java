package com.jindanupajit.propertymanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class Name {

    @Column (length = 50, nullable = false)
    public String first;

    @Column (length = 1, nullable = false)
    public String middle;

    @Column (length = 50, nullable = false)
    public String last;

    public Name() {
        first = "John";
        middle = "R";
        last = "Doe";
    }

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    @Override
    public String toString() {
        return String.format("%50s %1s %50s", first, middle, last)
               .replaceAll("\\s+", " ").trim();
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
