package com.curso.springboot.error.springbooterror.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.curso.springboot.error.springbooterror.models.Error;

@RestControllerAdvice
public class HandlerExceptionController {
    
    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<Error> divisionPorCero(Exception ex) {
        Error error = new Error();
        error.setFecha(new Date());
        error.setMensaje("Error de división por cero");
        error.setError(ex.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.internalServerError().body(error);
    }

}
