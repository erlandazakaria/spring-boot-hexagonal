package com.learn.hexagonal.adapter.repository;

public class DataEntity {
    private String key;
    private Object data;

    public DataEntity(String key, Object data) {
        this.key = key;
        this.data = data;
    }

    public DataEntity() {
    }

    public String getKey() {
        return key;
    }

    public Object getData() {
        return data;
    }
}
