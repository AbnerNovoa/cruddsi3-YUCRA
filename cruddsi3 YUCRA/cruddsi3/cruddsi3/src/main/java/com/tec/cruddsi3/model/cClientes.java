package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class cClientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clientes")
    private int id;

    @Column(name = "nombres", length = 50)
    private String nombres;

    @Column(name = "apellidos", length = 50)
    private String apellidos;

    @Column(name = "direccion", length = 100)
    private String direccion;

    @Column(name = "correo", length = 50)
    private String correo;

    @Column(name = "telf_cel", length =11)
    private String telf_cel;

    public cClientes() {
    }

    public cClientes(int id, String nombres, String apellidos, String direccion, String correo, String telf_cel) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telf_cel = telf_cel;
    }

    public cClientes(String nombres, String apellidos, String direccion, String correo, String telf_cel) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telf_cel = telf_cel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelf_cel() {
        return telf_cel;
    }

    public void setTelf_cel(String telf_cel) {
        this.telf_cel = telf_cel;
    }

    

}
