package com.epam.learning.product.init;

import com.epam.learning.product.data.ProductDataGenerator;
import com.epam.learning.product.model.Manufacturer;
import com.epam.learning.product.model.Name;
import com.epam.learning.product.model.Product;

public class ProductPoolInitializer {

    public static Product[] generateProductPool(int numberOfProducts) {
        Product[] products = new Product[numberOfProducts];
        for (int i = 0; i < products.length; i++) {
            Product product = new Product(i + 1, Name.getRandom(), ProductDataGenerator.generateUpc(), Manufacturer.getRandom(),
                    ProductDataGenerator.generatePrice(), ProductDataGenerator.generateShelfLife(), ProductDataGenerator.generateQuantity());
            products[i] = product;
        }
        return products;
    }

}
