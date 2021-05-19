package com.epam.learning.product.model;

import java.util.Random;

public enum Name {
    Beatrix, Arya, Brooklyn, Clementine, Enzo, Kai, Lola, Lulu, Maxwell, Quinn;

    public static Name getRandom() {
        int numberOfNames = Name.values().length;
        return Name.values()[new Random().nextInt(numberOfNames)];
    }
}
