package com.epam.learning;

import com.epam.learning.data.CustomDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SubCalTest extends BaseTest {

    @Test
    public void subCalculationTestSimpleValues() {
        long result = calculator.sub(21, 19);
        Assert.assertEquals(result, 2, "Calculation is incorrect");
    }

    @Test
    public void subRandomValidLongValues() {
        long firstValue = new Random().nextLong();
        long secondValue = new Random().nextLong();
        long result = firstValue - secondValue;
        long resultFromCalculator = calculator.sub(firstValue, secondValue);
        Assert.assertEquals(result, resultFromCalculator, "Calculation of subtraction random values is incorrect");
    }

    @Test(dataProvider = "subValuesProvider", dataProviderClass = CustomDataProvider.class)
    public void sumSpecificDataProviderValues(long firstValue, long secondValue) {
        long resultOfSub = firstValue - secondValue;
        long resultOfSubFromCalculator = calculator.sub(firstValue, secondValue);
        Assert.assertEquals(resultOfSubFromCalculator, resultOfSub, "Calculation of subtraction for DataProvider values is incorrect");
    }


}
