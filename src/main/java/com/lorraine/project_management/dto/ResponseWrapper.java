package com.lorraine.project_management.dto;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;


public class ResponseWrapper {

    private boolean success;
    private String message;
    private Object data;
    private Integer code;


    public ResponseWrapper(String message, Object data, HttpStatus httpStatus) {
        this.success = true;
        this.message = message;
        this.code = httpStatus.value();
        this.data = data;
    }

    public ResponseWrapper( String message, HttpStatus httpStatus) {
        this.success = true;
        this.message = message;
        this.code = httpStatus.value();
    }
}
