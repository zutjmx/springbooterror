package com.curso.springboot.error.springbooterror.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.error.springbooterror.models.domain.Usuario;
import com.curso.springboot.error.springbooterror.services.DataFaker;
import com.curso.springboot.error.springbooterror.services.UsuarioService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> mostrarUsuario(@PathVariable(name = "id") Long id) {        
        Optional<Usuario> optional = usuarioService.obtenerPorId(id);        
        if (optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }        
        return ResponseEntity.ok(optional.orElseThrow());
    }

    @GetMapping("/listar")
    public List<Usuario> listaUsuarios() {
        List<Usuario> usuarios = usuarioService.listar();        
        return usuarios;
    }    
    
}
