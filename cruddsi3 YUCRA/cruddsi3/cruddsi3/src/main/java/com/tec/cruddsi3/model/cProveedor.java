package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class cProveedor {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private int id;
    
    @Column(name = "nombre_proveedor", length = 50)
    private String nombre_proveedor;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "ciudad", length = 200)
    private String ciudad;

    @Column(name = "telefono", length = 9)
    private String telefono;

    public cProveedor() {
    }

    public cProveedor(int id, String nombre_proveedor, String direccion, String ciudad, String telefono) {
        this.id = id;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public cProveedor(String nombre_proveedor, String direccion, String ciudad, String telefono) {
        this.nombre_proveedor = nombre_proveedor;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    
}
