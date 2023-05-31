package com.test.service2.component;

import lombok.Data;

@Data
public class ServiceResponse {
    public ServiceResponse(String message, Object data) {
        this.data = data;
        this.message = message;
    }

    private Object data;
    private String message;
}
