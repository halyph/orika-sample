package com.halyph.entity;

import java.util.Date;

public class Person {
    private Name name;
    private Name alias;
    private Date birthDate;

    public Person(Name name, Date birthDate,
                  Name alias) {
        this.name = name;
        this.birthDate = (Date) birthDate.clone();
        this.alias = alias;
    }

    public Name getAlias() {
        return alias;
    }

    public Name getName() {
        return name;
    }

    public Date getBirthDate() {
        return (Date) birthDate.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", alias=" + alias +
                ", birthDate=" + birthDate +
                '}';
    }
}