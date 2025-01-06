package com.curso.springboot.error.springbooterror.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.error.springbooterror.models.domain.Usuario;
import com.curso.springboot.error.springbooterror.services.DataFaker;
import com.curso.springboot.error.springbooterror.services.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private DataFaker dataFaker;

    @GetMapping
    public String indice() {
        //int numero = 100/0;
        int numero = Integer.parseInt("Q4AJLV7M0J");
        System.out.println("Número: " + numero);
        return "OK 200: ".concat(dataFaker.getTexto());
    }

    @GetMapping("/mostrar/{id}")
    public Usuario mostrarUsuario(@PathVariable(name = "id") Long id) {
        Usuario usuario = usuarioService.obtenerPorId(id);
        return usuario;
    }

    @GetMapping("/listar")
    public List<Usuario> listaUsuarios() {
        return usuarioService.listar();
    }    
    
}
