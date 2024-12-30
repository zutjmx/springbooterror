package com.curso.springboot.error.springbooterror.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerExceptionController {
    
    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<?> divisionPorCero(Exception ex) {
        return ResponseEntity.internalServerError().body("Error: " + ex.getMessage() + " - " + ex.getCause());
    }

}
