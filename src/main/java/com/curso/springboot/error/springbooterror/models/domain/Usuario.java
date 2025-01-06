package com.curso.springboot.error.springbooterror.models.domain;

public class Usuario {
    private Long id;
    private String nombre;
    private String paterno;
    private String materno;
    private String email;

    private Role role;

    public Usuario() {
    }

    public Usuario(
        Long id,
        String nombre, 
        String apellido, 
        String materno, 
        String email
    ) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = apellido;
        this.materno = materno;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String apellido) {
        this.paterno = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getNombreRole() {
        return role.getNombre();
    }
}
