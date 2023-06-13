package com.test.service2.exceptions;

public class DataNotFoundException extends RuntimeException{
    public DataNotFoundException(String msg) {
        super(msg);
    }
}
