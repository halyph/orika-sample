package com.halyph.entity;

public class NameDto {
    private String first;
    private String last;

    public NameDto() {
    }

    public NameDto(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "NameDto{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
