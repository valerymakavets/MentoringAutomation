package com.epam.learning;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

// TODO: take a look at the comments I left in PositiveValueTest and DivisionTest classes and
//  make the same improvement here (variable name, data provider in a separate class, formatting etc)
public class SumCalTest extends BaseTest {

    @Test
    public void sumRandomValidLongValues() {
        long a = new Random().nextLong();
        long b = new Random().nextLong();
        long r = a + b;
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, r, "Calculation is incorrect");
    }

    @Test(invocationCount = 2)
    public void sumRandomIntAndLongValues() {
        int a = new Random().nextInt();
        long b = new Random().nextLong();
        long r = a + b;
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, r, "Calculation is incorrect");
    }

    @Test (dataProvider = "valuesForSum")
    public void sumSpecificDataProviderValues(double a, double b, double expectedResult) {
        double result = calculator.sum(a,b);
        Assert.assertEquals(result, expectedResult, "Calculation for DataProvider values is incorrect");
    }

    @DataProvider(name = "valuesForSum")
    public Object[][] dataProviderForSum() {
        return new Object[][]{
                {4.5, 2, 6.5},
                {-10, -5.5, -15.5},
                {0,0,0},
                {0,1.5,1.5},
                {1,0.11111,1.11111},
                {-5,5,0},
                {5,-5,0}
        };
    }

}
