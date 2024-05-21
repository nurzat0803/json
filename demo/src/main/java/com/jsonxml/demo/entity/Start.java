package com.jsonxml.demo.entity;

public class Start {
    private Integer epoch;
    private String data;

    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Start{" +
                "epoch=" + epoch +
                ", data='" + data + '\'' +
                '}';
    }
}
