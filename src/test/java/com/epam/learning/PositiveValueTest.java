package com.epam.learning;

import com.epam.learning.data.CustomDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveValueTest extends BaseTest {

    @Test(dataProvider = "values")
    public void positiveValueCheck(long a) {
        boolean b = calculator.isPositive(a);
        Assert.assertTrue(b);
    }

    @Test(dataProvider = "values") //todo: Ask, is it ok to test positive and negative in one class
    public void negativeValueCheck(long a) {
        boolean b = calculator.isNegative(a);
        Assert.assertTrue(b);
    }

    @DataProvider(name = "values")
    //todo: Ask, which values need to test, and should we use values which will failed in test
    public Object[][] dataProviderForPositive() {
        return new Object[][]{
                {4},
                {-10},
                {0},
                {1}
        };
    }

    // TODO: take a look at these tests and the way I used data provider (a separate class as a single point
    //  for storing test data in your project). Refactor this Test Class, delete all unnecessary things,
    //  think properly about class name if you want to check both negative and positive values
    @Test(dataProvider = "positiveValuesProvider", dataProviderClass = CustomDataProvider.class)
    public void verifyValueIsPositive(long value) {
        boolean result = calculator.isPositive(value);
        Assert.assertTrue(result);
    }

    @Test(dataProvider = "negativeValuesProvider", dataProviderClass = CustomDataProvider.class)
    public void verifyValueIsNegative(long value) {
        boolean result = calculator.isNegative(value);
        Assert.assertTrue(result);
    }
}
