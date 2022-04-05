package com.learn.hexagonal.application.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.learn.hexagonal.adapter.repository.DataRepository;
import com.learn.hexagonal.application.model.Data;
import com.learn.hexagonal.application.port.in.GetDataUseCase;
import com.learn.hexagonal.application.port.out.LoadData;

public class DataService implements GetDataUseCase {

    private LoadData loadData;

    @Override
    public Data getData(String key) throws JsonProcessingException {
        return loadData.load(key);
    }
}
