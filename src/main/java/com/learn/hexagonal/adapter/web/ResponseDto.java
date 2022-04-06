package com.learn.hexagonal.adapter.web;

import com.learn.hexagonal.application.model.Data;

public class ResponseDto {
    private int status;
    private Data data;

    public ResponseDto(int status, Data data) {
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
