package com.learn.hexagonal.application.config;

import com.learn.hexagonal.adapter.client.RestClientAdapter;
import com.learn.hexagonal.adapter.repository.DataRepository;
import com.learn.hexagonal.application.port.in.GetDataUseCase;
import com.learn.hexagonal.application.port.out.LoadData;
import com.learn.hexagonal.application.service.DataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProfileAConfig {

    @Bean
    public LoadData loadData(){
        return new DataRepository();
    }

    @Bean
    public RestClientAdapter restClientAdapter() {
        RestTemplate restTemplate = new RestTemplate();
        return new RestClientAdapter(restTemplate);
    }

    @Bean
    public GetDataUseCase getDataUseCase() {
        return new DataService(loadData());
    }
}
