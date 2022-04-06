package com.learn.hexagonal.adapter.client;

import com.learn.hexagonal.adapter.repository.DataEntity;
import com.learn.hexagonal.application.model.Data;
import com.learn.hexagonal.application.port.out.LoadData;
import org.springframework.web.client.RestTemplate;

public class RestClientAdapter implements LoadData {

    private static final String REMOTE_SERVER_URL = "http://localhost:8081/";
    private RestTemplate restTemplate;

    public RestClientAdapter(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Data load(String key) {
        DataEntity loadedData = restTemplate.getForObject(REMOTE_SERVER_URL + key, DataEntity.class);
        Data data = new Data(loadedData.getKey(), loadedData.getData());
        return data;
    }
}
