package com.example.pedomon.data;

public class Steps {
    private int steps;
    private String date;

    public Steps(String date) {
        this.date = date;
        this.steps = 0;
    }

    public void addSteps(int count) {
        steps = steps + count;
    }

    public int getSteps() {
        return steps;
    }

    public String getDate() {
        return date;
    }
}

