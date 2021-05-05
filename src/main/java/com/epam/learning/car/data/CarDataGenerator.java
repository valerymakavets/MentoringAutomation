package com.epam.learning.car.data;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Random;

public class CarDataGenerator {

    public static String generateModel() {
        String[] models = {"Mondeo", "Kalina", "Tucson", "Cube", "Polo", "Impreza", "Civic", "anything else"};
        int numberOfModels = models.length;
        return models[new Random().nextInt(numberOfModels)];
    }

    public static double generatePrice() {
        double minValue = 5000;
        double maxValue = 10000;
        double precisePrice = RandomUtils.nextDouble(minValue, maxValue);
        BigDecimal bigDecimal = new BigDecimal(precisePrice).setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static String generateRegistrationNumber() {
        String region = RandomStringUtils.randomAlphabetic(2);
        String number = RandomStringUtils.randomNumeric(4);
        return String.join("-", region, number);
    }

    public static int generateProductionYear() {
        int minYear = 1960;
        int maxYear = LocalDate.now().getYear();
        return RandomUtils.nextInt(minYear, maxYear);
    }
}
