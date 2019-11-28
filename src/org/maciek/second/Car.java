package org.maciek.second;

public class Car {
    private String registrationNumber;
    private String brand;
    private String model;

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
}
