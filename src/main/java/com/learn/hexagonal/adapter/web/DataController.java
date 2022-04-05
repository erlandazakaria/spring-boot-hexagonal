package com.learn.hexagonal.adapter.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.learn.hexagonal.application.model.Data;
import com.learn.hexagonal.application.model.ResponseData;
import com.learn.hexagonal.application.port.in.GetDataUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DataController {

    @Autowired
    private final GetDataUseCase getDataUseCase;

//    public DataController(GetDataUseCase getDataUseCase) {
//        this.getDataUseCase = getDataUseCase;
//    }

    @GetMapping("/")
    public Object get() throws JsonProcessingException {
        Data data = getDataUseCase.getData("foo");
//        ObjectMapper objectMapper = new ObjectMapper();
//        Data data = new Data("a", objectMapper.readTree("{\"foo\":\"bar\"}"));
        ResponseData responseData = new ResponseData(HttpStatus.OK.value(), data);
        return ResponseEntity.ok(responseData);
    }
}
