package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "ventas")
public class cVentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ventas")
    private int id;

    @Column(name = "producto_seleccionado",length = 50)
    private String producto_seleccionado;

    @Column(name = "cantidad", length = 50)
    private double cantidad;

    @Column(name = "precio", columnDefinition = "decimal(18,2)")
    private double precio;

    public cVentas() {
    }

    public cVentas(int id, String producto_seleccionado, double cantidad, double precio) {
        this.id = id;
        this.producto_seleccionado = producto_seleccionado;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public cVentas(String producto_seleccionado, double cantidad, double precio) {
        this.producto_seleccionado = producto_seleccionado;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto_seleccionado() {
        return producto_seleccionado;
    }

    public void setProducto_seleccionado(String producto_seleccionado) {
        this.producto_seleccionado = producto_seleccionado;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    
}
