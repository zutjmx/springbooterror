package com.curso.springboot.error.springbooterror.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.springboot.error.springbooterror.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private DataFaker dataFaker;

    @Override
    public List<Usuario> listar() {
        return dataFaker.getUsuarios();
    }

    @Override
    public Usuario obtenerPorId(Long id) {
        //return dataFaker.getUsuarioById(id);
        return dataFaker.getUsuarios().stream()
            .filter(usuario -> usuario.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
    
}
