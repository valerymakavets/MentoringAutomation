package com.epam.learning.product;

public class Product {

    private int id;
    private String name;
    private int UPC;
    private String manufacturer;
    private double price;
    private int shelfLife;
    private int number;

    public Product(int id, String name, int UPC, String manufacturer, double price, int shelfLife, int number) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUPC() {
        return UPC;
    }

    public void setUPC(int UPC) {
        this.UPC = UPC;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", Name = " + name +
                ", UPC = " + UPC +
                ", Manufacturer = " + manufacturer +
                ", Price = " + price +
                ", Shelf life = " + shelfLife +
                ", Quantity = " + number;
    }
}
