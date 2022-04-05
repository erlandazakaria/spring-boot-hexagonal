package com.learn.hexagonal.application.model;

public class ResponseData {
    private int status;
    private Data data;

    public ResponseData(int status, Data data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public Data getData() {
        return data;
    }
}
