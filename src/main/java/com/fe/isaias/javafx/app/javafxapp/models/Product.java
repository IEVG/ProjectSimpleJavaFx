package com.fe.isaias.javafx.app.javafxapp.models;

public class Product {

    private Long id;
    private String name;
    private String description;
    private Long price;

    public Product(String name, String descripcion, Long price) {
        this.name = name;
        this.description = descripcion;
        this.price = price;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
