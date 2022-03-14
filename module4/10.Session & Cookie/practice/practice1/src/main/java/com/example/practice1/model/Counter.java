package com.example.practice1.model;

public class Counter {
    private Integer count;

    public Counter() {
    }

    public Counter(int count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public int increment() {
        return count++;
    }


}
