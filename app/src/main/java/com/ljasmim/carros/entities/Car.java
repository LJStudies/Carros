package com.ljasmim.carros.entities;

/**
 * Created by ljasmim on 25/08/17.
 */

public class Car {

    private int id;
    private String model;
    private int power;
    private Double price;

    public Car(){}

    public Car(int id, String model, int power, Double price) {
        this.id = id;
        this.model = model;
        this.power = power;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
