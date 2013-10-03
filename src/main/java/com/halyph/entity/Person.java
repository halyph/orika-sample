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

    public void setName(Name name) {
        this.name = name;
    }

    public void setAlias(Name alias) {
        this.alias = alias;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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