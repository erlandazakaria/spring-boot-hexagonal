package com.learn.hexagonal.adapter.repository;

import com.learn.hexagonal.adapter.client.RestClientAdapter;
import com.learn.hexagonal.application.model.Data;
import com.learn.hexagonal.application.port.out.LoadData;
import org.springframework.beans.factory.annotation.Autowired;

public class DataRepository implements LoadData {

    @Autowired
    RestClientAdapter restClientAdapter;

    @Override
    public Data load(String key) {
        return restClientAdapter.load(key);
    }
}
