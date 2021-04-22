package com.epam.learning;

import com.epam.learning.data.CustomDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SumCalTest extends BaseTest {

    @Test
    public void sumRandomValidLongValues() {
        long firstValue = new Random().nextLong();
        long secondValue = new Random().nextLong();
        long result = firstValue + secondValue;
        long resultFromCalculator = calculator.sum(firstValue, secondValue);
        Assert.assertEquals(result, resultFromCalculator, "Calculation is incorrect");
    }

    @Test
    public void sumRandomIntAndLongValues() {
        int firstValue = new Random().nextInt();
        long secondValue = new Random().nextLong();
        long result = firstValue + secondValue;
        long resultFromCalculator = calculator.sum(firstValue, secondValue);
        Assert.assertEquals(result, resultFromCalculator, "Calculation is incorrect");
    }

    @Test(dataProvider = "sumValuesProvider", dataProviderClass = CustomDataProvider.class)
    public void sumSpecificDataProviderValues(double firstValue, double secondValue, double expectedResult) {
        double result = calculator.sum(firstValue, secondValue);
        Assert.assertEquals(result, expectedResult, "Calculation for DataProvider values is incorrect");
    }


}
