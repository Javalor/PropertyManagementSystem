package com.jindanupajit.propertymanagementsystem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@SequenceGenerator(name="person", initialValue=1, allocationSize=1)
public abstract class Person {

    @Id
    @GeneratedValue(generator = "person", strategy = GenerationType.SEQUENCE)
    private long id;

    @Embedded
    @AttributeOverride(name="first",    column=@Column(name="firstname"))
    @AttributeOverride(name="middle",   column=@Column(name="middlename"))
    @AttributeOverride(name="last",     column=@Column(name="lastname"))
    @Column(nullable = false)
    @NotNull
    private Name name;

    public Person() {
        name = new Name();
    }

    public Person(final Name name) {
        this.name = name;
    }

    public Person(final String first, final String middle, final String last) {
        this.name = new Name(first, middle, last);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
