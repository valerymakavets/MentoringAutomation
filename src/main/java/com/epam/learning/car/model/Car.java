package com.epam.learning.car.model;

public class Car {

    private long id;
    private Brand brand;
    private String model;
    private int productionYear;
    private Colour colour;
    private double price;
    private String registrationNumber;

    // a default constructor, no fields will be initialized
    public Car() {
    }

    // a constructor with required fields initialization (I decided what fields are required or optional based on the task description)
    public Car(long id, Brand brand, String model, int yearOfProduction, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.productionYear = yearOfProduction;
        this.price = price;
    }

    // a constructor with all (required / and optional) fields initialization
    public Car(long id, Brand brand, String model, int year, Colour colour, double price, String number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.productionYear = year;
        this.colour = colour;
        this.price = price;
        this.registrationNumber = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int yearOfProduction) {
        this.productionYear = yearOfProduction;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    // why we use setters and announce class fields as private?
    // because we can put some logic into setter before assign a value to the field
    public void setPrice(double price) {
        if (price < 0) {
            this.price = Math.abs(price);
        }
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", colour=" + colour +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
