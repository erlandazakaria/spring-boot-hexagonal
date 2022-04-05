package com.learn.hexagonal.application.port.out;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.learn.hexagonal.application.model.Data;

public interface LoadData {
    Data load(String key) throws JsonProcessingException;
}
