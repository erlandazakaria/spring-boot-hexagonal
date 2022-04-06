package com.learn.hexagonal.adapter.web;

import com.learn.hexagonal.application.model.Data;
import com.learn.hexagonal.application.port.in.GetDataUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DataController {

    @Autowired
    private GetDataUseCase getDataUseCase;

    @GetMapping("/{key}")
    public Object get(@PathVariable("key") String key) {
        Data data = getDataUseCase.getData(key);
        ResponseDto responseData = new ResponseDto(HttpStatus.OK.value(), data);
        return ResponseEntity.ok(responseData);
    }
}
