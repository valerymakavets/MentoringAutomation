package com.epam.learning.product;

import java.util.Scanner;

import static com.epam.learning.product.Products.listOfAllProducts;

public class Main {
    public static void main(String[] args) {
        Product[] productsList = listOfAllProducts(10);
        Scanner scanner = new Scanner(System.in);
        showListOfMatchedProductsByName(productsList, scanner);
        showListOfProductsWhichPriceIsUnder(productsList, scanner);
        showListOfProductsWhichShelfLifeIsMore(productsList, scanner);
    }

    static void showListOfMatchedProductsByName(Product[] productsList, Scanner reader) { //name of the method
        System.out.println("TASK A");
        System.out.print("Enter name of the product: ");
        String name = reader.nextLine();
        showMatchedProductByName(productsList, name);
    }

    static void showListOfProductsWhichPriceIsUnder(Product[] productsList, Scanner reader) {
        System.out.println("TASK B");
        System.out.print("Enter name of the product: ");
        String name = reader.nextLine();
        System.out.print("Enter the price of the product: ");
        int price = reader.nextInt();
        showMatchedProductByNameAndPrice(productsList, name, price);
    }

    static void showListOfProductsWhichShelfLifeIsMore(Product[] productsList, Scanner reader) {
        System.out.println("TASK C");
        System.out.print("Enter the shelf life of the product: ");
        int shelfLife = reader.nextInt();
        showMatchedProductByShelfLife(productsList, shelfLife);
    }

    static void showMatchedProductByName(Product[] products, String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
        System.out.println();
    }

    static void showMatchedProductByNameAndPrice(Product[] products, String name, double price) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name) && product.getPrice() <= price) {
                System.out.println(product);
            }
        }
        System.out.println();
    }

    static void showMatchedProductByShelfLife(Product[] products, int shelfLife) {
        for (Product product : products)
            if (product.getShelfLife() > shelfLife)
                System.out.println(product);
    }
}
