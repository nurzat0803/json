package com.jsonxml.demo.entity;

public class Process1 {
    private String name;
    private Integer id;
    private Start start;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Process{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", start=" + start +
                '}';
    }
}
