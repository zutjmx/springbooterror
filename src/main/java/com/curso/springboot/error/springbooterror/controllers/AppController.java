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
        //int numero = 100/0;
        int numero = Integer.parseInt("Q4AJLV7M0J");
        System.out.println("Número: " + numero);
        return "OK 200: ".concat(dataFaker.getTexto());
    }
    
}
