package com.test.service2.controller;

import com.test.service2.component.ServiceResponse;
import com.test.service2.model.ServiceInput;
import com.test.service2.service.InputService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/second-service")
public class SecondServiceController {
    @Autowired
    private final InputService inputService;

    @GetMapping("/get-data")
    public ResponseEntity<ServiceResponse> getDataByServiceName() {
        List<ServiceInput> inputs = inputService.getServiceData("second-service");

        if (!inputs.isEmpty()) {
            return new ResponseEntity<>(new ServiceResponse("data found", inputs), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new ServiceResponse("data not found", inputs), HttpStatus.NO_CONTENT);
        }
    }
}
