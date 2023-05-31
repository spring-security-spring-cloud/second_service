package com.test.service2.service;

import com.test.service2.model.ServiceInput;

import java.util.List;

public interface InputService {
    List<ServiceInput> getServiceData(String serviceName);
}
