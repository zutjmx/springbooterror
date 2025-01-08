package com.curso.springboot.error.springbooterror.services;

import java.util.List;
import java.util.Optional;

import com.curso.springboot.error.springbooterror.models.domain.Usuario;

public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> obtenerPorId(Long id);
}
