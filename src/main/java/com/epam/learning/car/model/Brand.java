package com.epam.learning.car.model;

import java.util.Random;

public enum Brand {
    FORD, AUDI, BMW, NISSAN, TOYOTA, MERCEDES, SUBARU, LADA, HONDA, VOLKSWAGEN;

    public static Brand getRandom() {
        int numberOfBrands = Brand.values().length;
        return Brand.values()[new Random().nextInt(numberOfBrands)];
    }
}