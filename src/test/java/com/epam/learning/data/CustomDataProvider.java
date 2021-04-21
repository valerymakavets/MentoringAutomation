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
}
