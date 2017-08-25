package com.ljasmim.carros.entities;

import android.graphics.drawable.Drawable;

/**
 * Classe que representa a Entidade Carro
 * Created by ljasmim on 25/08/17.
 */

public class Car {

    private int id;
    private String model;
    private String manufacturer;
    private int power;
    private Double price;
    private Drawable picture;

    public Car(){}

    public Car(int id, String model, String manufacturer, int power, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.power = power;
        this.price = price;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPower() {
        return power;
    }

    public Double getPrice() {
        return price;
    }

    public Drawable getPicture() {
        return picture;
    }
}
