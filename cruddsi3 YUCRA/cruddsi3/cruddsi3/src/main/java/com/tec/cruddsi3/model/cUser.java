package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class cUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int id_user;
    
    @Column(name = "nombre_usuario", length = 50)
    private String nombre_usuario;

    @Column(name = "contraseña", length = 200)
    private String contraseña;

    @Column(name = "rol", length = 9)
    private String rol;

    public cUser() {

    }

    public cUser(int id_user, String nombre_usuario, String contraseña, String rol) {
        this.id_user = id_user;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public cUser(String nombre_usuario, String contraseña, String rol) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    


}
