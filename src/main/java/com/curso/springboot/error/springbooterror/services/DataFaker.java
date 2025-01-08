package com.curso.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.springboot.error.springbooterror.models.domain.Usuario;
import com.github.javafaker.Faker;

@Service
public class DataFaker {

    private Faker faker = new Faker();

    public String getTexto() {
        return faker.lorem().sentence();
    }

    public Usuario getUsuarioById(Long id) {
        return new Usuario(
            id,
            faker.name().firstName(),
            faker.name().lastName(),
            faker.name().lastName(),
            faker.internet().emailAddress()
        );
    }

    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        int index = faker.number().numberBetween(10, 20);
        for (int i = 0; i < index; i++) {            
            usuarios.add(
                new Usuario(
                    Long.valueOf(i),
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().lastName(),
                    faker.internet().emailAddress()
                )
            );
        }
        return usuarios;
    }
}
