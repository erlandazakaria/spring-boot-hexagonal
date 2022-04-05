package com.learn.hexagonal.application.model;

import com.fasterxml.jackson.databind.JsonNode;

public class Data {
    private String key;
    private JsonNode content;

    public Data(String key, JsonNode content) {
        this.key = key;
        this.content = content;
    }

    public String getKey() {
        return key;
    }

    public JsonNode getContent() {
        return content;
    }
}
