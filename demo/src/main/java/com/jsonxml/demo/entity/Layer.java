package com.jsonxml.demo.entity;

public class Layer {
    private String dailyScheduler;

    public String getDailyScheduler() {
        return dailyScheduler;
    }

    public void setDailyScheduler(String dailyScheduler) {
        this.dailyScheduler = dailyScheduler;
    }

    @Override
    public String toString() {
        return "Layer{" +
                "dailyScheduler='" + dailyScheduler + '\'' +
                '}';
    }
}
