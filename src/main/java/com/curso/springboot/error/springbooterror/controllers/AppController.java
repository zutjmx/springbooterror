package com.curso.springboot.error.springbooterror.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppController {

    @GetMapping("/app")
    public String getMethodName() {
        return "OK 200";
    }
    
}
