package com.curso.springboot.error.springbooterror.exceptions;

public class UsuarioNoEncontradoException extends RuntimeException {
    public UsuarioNoEncontradoException(String message) {
        super("Error: ".concat(message));
    }
}
