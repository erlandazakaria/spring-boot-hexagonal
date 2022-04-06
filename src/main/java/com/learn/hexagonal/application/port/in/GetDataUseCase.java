package com.learn.hexagonal.application.port.in;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.learn.hexagonal.application.model.Data;

public interface GetDataUseCase {
    Data getData(String key);
}
