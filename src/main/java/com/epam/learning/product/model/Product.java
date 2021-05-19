package com.epam.learning.product.model;

public class Product {
    private int id;
    private Name productName;
    private int upc;
    private Manufacturer manufacturer;
    private double price;
    private int shelfLife;
    private int quantity;

    public Product(){

    }

    public Product(int id, Name productName, int upc, Manufacturer manufacturer, double price, int shelfLife, int quantity) {
        this.id = id;
        this.productName = productName;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getProductName() {
        return productName;
    }

    public void setProductName(Name productName) {
        this.productName = productName;
    }

    public int getUpc() {
        return upc;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + productName + '\'' +
                ", upc=" + upc +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", shelfLife=" + shelfLife +
                ", quantity=" + quantity +
                '}';
    }
}