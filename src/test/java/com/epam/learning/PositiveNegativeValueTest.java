package com.epam.learning;

import com.epam.learning.data.CustomDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveNegativeValueTest extends BaseTest {

    @Test(dataProvider = "positiveValuesProvider", dataProviderClass = CustomDataProvider.class)
    public void positiveValueCheck(long value) {
        boolean result = calculator.isPositive(value);
        Assert.assertTrue(result);
    }

    @Test(dataProvider = "negativeValuesProvider", dataProviderClass = CustomDataProvider.class)
    public void negativeValueCheck(long value) {
        boolean result = calculator.isNegative(value);
        Assert.assertTrue(result);
    }
}
