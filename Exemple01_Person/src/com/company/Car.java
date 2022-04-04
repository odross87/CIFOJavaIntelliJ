package com.company;

public class Car {
    private String brand;
    private String model;
    private int power;
    private boolean electric;

    //First constructor
    public Car() {
    }

    //Second constructor
    public Car(String brand, String model, int power, boolean electric) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.electric = electric;
    }

    //Getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    //Setters
    public void setPower(int power) {
        this.power = power;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
