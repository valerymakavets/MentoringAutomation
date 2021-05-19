package com.epam.learning.product.util;

import com.epam.learning.product.model.Name;
import com.epam.learning.product.model.Product;

public class ProductStatisticHandler {
    public static void printProductsWithSpecifiedNames(Product[] productPool, Name name) {
        System.out.println("List of cars with name " + name);
        for (int i = 0; i < productPool.length; i++) {
            if (productPool[i].getProductName().equals(name)) {
                System.out.println(productPool[i]);
            }
        }
    }

    public static void printProductsOfSpecifiedNameAndPriceIsLessThanProvided(Product[] products, Name name, double price) {
        System.out.println("List of products with name " + name + " and price is less than " + price);
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(name) & products[i].getPrice() < price) {
                System.out.println(products[i]);
            }
        }
    }

    public static void printProductsWhichShelfLifeMoreThanProvided(Product[] products, int shelfLife) {
        System.out.println("Below you can see the list with products which shelf life is more than " + shelfLife);
        for (int i = 0; i < products.length; i++) {
            if (products[i].getShelfLife() > shelfLife) {
                System.out.println(products[i]);
            }
        }
    }
}
