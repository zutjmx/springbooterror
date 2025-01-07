package com.curso.springboot.error.springbooterror.exceptions;

public class RoleNuloException extends RuntimeException {
    public RoleNuloException(String message) {
        super("Error: ".concat(message));
    }
}
