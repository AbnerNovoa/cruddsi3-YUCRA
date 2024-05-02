package com.tec.cruddsi3.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class cCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private int id;

    @Column(name = "nombre_categoria", length = 50)
    private String nombre_categoria;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    public cCategoria() {
    }

    public cCategoria(int id, String nombre_categoria, String descripcion) {
        this.id = id;
        this.nombre_categoria = nombre_categoria;
        this.descripcion = descripcion;
    }

    public cCategoria(String nombre_categoria, String descripcion) {
        this.nombre_categoria = nombre_categoria;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    
}
