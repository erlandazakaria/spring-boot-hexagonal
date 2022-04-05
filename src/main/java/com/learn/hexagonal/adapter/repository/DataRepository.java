package com.learn.hexagonal.adapter.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn.hexagonal.application.model.Data;
import com.learn.hexagonal.application.port.out.LoadData;

public class DataRepository implements LoadData {

    @Override
    public Data load(String key) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Data data = new Data("a", objectMapper.readTree("{\"foo\":\"bar\"}"));
        return data;
    }
}
