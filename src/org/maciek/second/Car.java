package org.maciek.second;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    @NotNull
    private String registrationNumber;

    @NotNull
    @Size(min=2, max=10)
    private String brand;

    @NotNull
    private String model;

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber; //.toUpperCase();
    }

    public void setBrand(String brand) {
        //if (brand.length() > 0)
        this.brand = brand; //.substring(0,1).toUpperCase() + brand.substring(1);
    }

    public void setModel(String model) {
        //if (model.length() > 0)
        this.model = model; //.substring(0,1).toUpperCase() + model.substring(1);
    }

    public Car(String registrationNumber, String brand, String model) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
