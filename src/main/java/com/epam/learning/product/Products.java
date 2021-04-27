package com.epam.learning.product;

public class Products {
    public static Product[] listOfAllProducts(int i) {
        Product[] products = new Product[i]; //
        for (int j = 0; j< products.length - 1; j++){
            products[j] = new Product(j, "Name" + j, 1001 + j, "Manufacturer" + j, 1000 + j, 1 + j, 1 + j);
        }
        return products;
    }
}
