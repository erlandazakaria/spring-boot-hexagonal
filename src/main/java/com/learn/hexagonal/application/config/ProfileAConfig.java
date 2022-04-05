package com.learn.hexagonal.application.config;

import com.learn.hexagonal.HexagonalApplication;
import com.learn.hexagonal.application.service.DataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalApplication.class)
public class ProfileAConfig {
    
    @Bean
    DataService dataService() {
        return new DataService();
    }
}
