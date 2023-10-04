package com.test.service2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class APIExceptionHandler {
    @ExceptionHandler(value = {APIException.class}) // this handler can be used to handle multiple exception also
    public ResponseEntity<APIExceptionPayload> handleAPIException(APIException e) {
        APIExceptionPayload apiExceptionPayload = new APIExceptionPayload(
                e.getMessage(),
                HttpStatus.BAD_REQUEST,
                LocalDateTime.now()
                // to return full cause of exception
                //,e
        );

        return new ResponseEntity<>(apiExceptionPayload, HttpStatus.BAD_REQUEST);
    }
}
