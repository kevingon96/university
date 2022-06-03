package com.kevin.university.exception;

import lombok.Data;

@Data
public class BadRequestException extends RuntimeException{

    private String message;
    private String code;

    public BadRequestException(String message, String code) {
        this.message = message;
        this.code = code;
    }
}
