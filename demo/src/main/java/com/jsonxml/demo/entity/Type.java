package com.jsonxml.demo.entity;

public class Type {

    private String information;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Type{" +
                "information='" + information + '\'' +
                '}';
    }
}
