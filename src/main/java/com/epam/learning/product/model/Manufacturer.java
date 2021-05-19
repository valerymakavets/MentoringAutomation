package com.epam.learning.product.model;

import java.util.Random;

public enum Manufacturer {
    VolkswagenGroup, ToyotaGroup, Apple, Samsung, Daimler, Ford, Honda, GeneralMotors, Huawei, Nestle;

    public static Manufacturer getRandom() {
        int numberOfManufacturers = Manufacturer.values().length;
        return Manufacturer.values()[new Random().nextInt(numberOfManufacturers)];
    }
}
