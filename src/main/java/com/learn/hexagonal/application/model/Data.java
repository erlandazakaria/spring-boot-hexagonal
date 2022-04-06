package com.learn.hexagonal.application.model;

public class Data {
    private String key;
    private Object value;

    public Data(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
