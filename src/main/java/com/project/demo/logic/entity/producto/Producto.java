package com.project.demo.logic.entity.producto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import com.project.demo.logic.entity.categoria.Categoria;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @JsonBackReference
    private Categoria categoria;

    public Producto() {}

    public Producto(String nombre, String descripcion, double precio, int cantidadEnStock, Categoria categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.categoria = categoria;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public int getCantidadEnStock() { return cantidadEnStock; }
    public Categoria getCategoria() { return categoria; }

    public void setId(Long id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidadEnStock(int cantidadEnStock) { this.cantidadEnStock = cantidadEnStock; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}
