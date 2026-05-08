package com.projeto.order_api.entities;

public class Product {
    private Long id;
    private String name;
    private Double price;

    public Product() {

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // LONG (GET / SET) - ID (product)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
