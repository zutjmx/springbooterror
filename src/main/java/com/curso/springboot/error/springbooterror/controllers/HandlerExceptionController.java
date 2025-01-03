package com.curso.springboot.error.springbooterror.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

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
        //return ResponseEntity.internalServerError().body(error);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> noEncontrado(Exception ex) {
        Error error = new Error();
        error.setFecha(new Date());
        error.setMensaje("Ruta de API no encontrada");
        error.setError(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
