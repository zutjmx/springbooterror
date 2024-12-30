package com.curso.springboot.error.springbooterror.services;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class DataFaker {

    private Faker faker = new Faker();

    public String getTexto() {
        return faker.lorem().sentence();
    }
}
