package com.example.productos_app.model;

public class Product {
    private int id;
    private String nombre;
    private double precio;
    private String link;

    // Constructor
    public Product(int id, String nombre, double precio, String link) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.link = link;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
