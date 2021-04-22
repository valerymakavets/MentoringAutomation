package com.epam.learning.data;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "positiveValuesProvider")
    public static Object[][] getPositiveValues() {
        return new Object[][]{
                {Long.MAX_VALUE},
                {100}
        };
    }

    @DataProvider(name = "negativeValuesProvider")
    public static Object[][] getNegativeValues() {
        return new Object[][]{
                {Long.MIN_VALUE},
                {-100}
        };
    }

    @DataProvider(name = "subValuesProvider")
    public static Object[][] dataProviderForSub() {
        return new Object[][]{
                {4, 2},
                {-10, -5},
                {0, 0},
                {0, 1},
                {1, 0},
                {-5, 5},
                {5, -5}
        };
    }

    @DataProvider(name = "sumValuesProvider")
    public static Object[][] dataProviderForSum() {
        return new Object[][]{
                {4.5, 2, 6.5},
                {-10, -5.5, -15.5},
                {0, 0, 0},
                {0, 1.5, 1.5},
                {1, 0.11111, 1.11111},
                {-5, 5, 0},
                {5, -5, 0}
        };
    }
}
