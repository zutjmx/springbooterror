package com.curso.springboot.error.springbooterror.services;

import java.util.List;

import com.curso.springboot.error.springbooterror.models.domain.Usuario;

public interface UsuarioService {
    List<Usuario> listar();
    Usuario obtenerPorId(Long id);
}
