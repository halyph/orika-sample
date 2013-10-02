package com.halyph.entity;

import java.util.Arrays;
import java.util.Date;

public class PersonDto {
    private String firstName;
    private String lastName;
    private Date date;
    private String[] aliases;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Date getDate() {
        return date;
    }
    public String[] getAliases() {
        return aliases;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setAliases(String[] aliases) {
        this.aliases = aliases;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                ", aliases=" + Arrays.toString(aliases) +
                '}';
    }
}
