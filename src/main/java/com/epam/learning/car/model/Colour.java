package com.epam.learning.car.model;

import java.util.Random;

public enum Colour {

    WHITE, GREEN, YELLOW, BLACK, GREY, RED, BLUE;

    public static Colour generateRandom() {
        int numberOfColours = Colour.values().length;
        return Colour.values()[new Random().nextInt(numberOfColours)];
    }
}
