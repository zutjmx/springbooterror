package com.curso.springboot.error.springbooterror.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.error.springbooterror.services.DataFaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppController {

    @Autowired
    private DataFaker dataFaker;

    @GetMapping("/app")
    public String getMethodName() {
        return "OK 200: ".concat(dataFaker.getTexto());
    }
    
}
