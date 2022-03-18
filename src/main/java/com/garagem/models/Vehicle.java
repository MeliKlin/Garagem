package com.garagem.models;

import java.math.BigDecimal;

public class Vehicle {

    private String brand;
    private String model;
    private BigDecimal price;

    public Vehicle(String brand, String model, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " - preço: " + price;
    }

}
