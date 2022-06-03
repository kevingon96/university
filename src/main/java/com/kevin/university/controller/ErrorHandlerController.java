package com.kevin.university.controller;

import com.kevin.university.exception.BadRequestException;
import com.kevin.university.model.ResponseAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandlerController {

    @ResponseBody
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseAdvice badRequestHandler (BadRequestException ex){
        return new ResponseAdvice(ex.getCode(), ex.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseAdvice invalidArgumentHandler(MethodArgumentNotValidException ex) {
        return new ResponseAdvice("ERR_ARG", ex.getLocalizedMessage());
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ResponseAdvice internalServerErrorHandler(Exception ex) {
        return new ResponseAdvice("ERR_500", ex.getLocalizedMessage());
    }
}
