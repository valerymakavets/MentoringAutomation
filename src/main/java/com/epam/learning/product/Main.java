package com.epam.learning.product;

import com.epam.learning.product.data.ProductDataGenerator;
import com.epam.learning.product.init.ProductPoolInitializer;
import com.epam.learning.product.model.Name;
import com.epam.learning.product.model.Product;
import com.epam.learning.product.util.ProductStatisticHandler;

public class Main {
    public static void main(String[] args) {
        int numberOfProducts = 100;
        Product[] products = ProductPoolInitializer.generateProductPool(numberOfProducts);

        Name targetName = Name.getRandom();
        ProductStatisticHandler.printProductsWithSpecifiedNames(products, targetName);

        double targetPrice = ProductDataGenerator.generatePrice();
        ProductStatisticHandler.printProductsOfSpecifiedNameAndPriceIsLessThanProvided(products, targetName, targetPrice);

        int targetShelfLife = ProductDataGenerator.generateShelfLife();
        ProductStatisticHandler.printProductsWhichShelfLifeMoreThanProvided(products, targetShelfLife);
    }
}
