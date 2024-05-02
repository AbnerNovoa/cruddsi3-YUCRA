package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class cPedidos {
    
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedidos")
    private int id;

    @Column(name = "nombre_cliente", length = 50)
    private String nombre_cliente;

    @Column(name = "nombre_producto", length = 50)
    private String nombre_producto;

    @Column(name = "direccion_envio", length = 50)
    private String direccion_envio;

    @Column(name = "ciudad_envio", length = 50)
    private String ciudad_envio;

    @Column(name = "estado_pedido", length = 50)
    private String estado_pedido;


    public cPedidos() {
    }


    public cPedidos(int id, String nombre_cliente, String nombre_producto, String direccion_envio, String ciudad_envio,
            String estado_pedido) {
        this.id = id;
        this.nombre_cliente = nombre_cliente;
        this.nombre_producto = nombre_producto;
        this.direccion_envio = direccion_envio;
        this.ciudad_envio = ciudad_envio;
        this.estado_pedido = estado_pedido;
    }


    public cPedidos(String nombre_cliente, String nombre_producto, String direccion_envio, String ciudad_envio,
            String estado_pedido) {
        this.nombre_cliente = nombre_cliente;
        this.nombre_producto = nombre_producto;
        this.direccion_envio = direccion_envio;
        this.ciudad_envio = ciudad_envio;
        this.estado_pedido = estado_pedido;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre_cliente() {
        return nombre_cliente;
    }


    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }


    public String getNombre_producto() {
        return nombre_producto;
    }


    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }


    public String getDireccion_envio() {
        return direccion_envio;
    }


    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }


    public String getCiudad_envio() {
        return ciudad_envio;
    }


    public void setCiudad_envio(String ciudad_envio) {
        this.ciudad_envio = ciudad_envio;
    }


    public String getEstado_pedido() {
        return estado_pedido;
    }


    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }
    

    

    
}
