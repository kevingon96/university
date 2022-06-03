package com.kevin.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ResponseAdvice {

    private String code;
    private String message;

    public ResponseAdvice(String code, String message) {
        this.code = code;
        this.message = message;
    }
}


