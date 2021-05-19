package com.epam.learning.product.data;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProductDataGenerator {

    public static int generateUpc() {
        int minValue = 1;
        int maxValue = 10000;
        int finalUpc = RandomUtils.nextInt(minValue, maxValue);
        return finalUpc;
    }

    public static double generatePrice() {
        double minValue = 1;
        double maxValue = 10000;
        double precisePrice = RandomUtils.nextDouble(minValue, maxValue);
        BigDecimal bigDecimal = new BigDecimal(precisePrice).setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static int generateShelfLife() {
        int minValue = 1;
        int maxValue = 20;
        int finalShelfLife = RandomUtils.nextInt(minValue, maxValue);
        return finalShelfLife;
    }

    public static int generateQuantity() {
        int minValue = 1;
        int maxValue = 10000;
        int finalQuantity = RandomUtils.nextInt(minValue, maxValue);
        return finalQuantity;
    }
}
