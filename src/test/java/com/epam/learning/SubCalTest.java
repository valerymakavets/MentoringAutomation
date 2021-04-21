package com.epam.learning;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Random;

// TODO: take a look at the comments I left in PositiveValueTest and DivisionTest classes and
//  make the same improvement here (variable name, data provider in a separate class, formatting etc)
public class SubCalTest extends BaseTest {

    @Test
    public void subCalculationTestTwentyOneMinusNineteen(){
        long result = calculator.sub(21,19);
        Assert.assertEquals(result,2,"Calculation is incorrect");
    }

    @Test
    public void subRandomValidLongValues() {
        long a = new Random().nextLong();
        long b = new Random().nextLong();
        long r = a - b;
        long result = calculator.sub(a,b);
        Assert.assertEquals(result, r, "Calculation of subtraction random values is incorrect");
    }

    @Test (dataProvider = "valuesForSub")
    public void sumSpecificDataProviderValues(long a, long b) {
        long subResult = a - b;
        long resultOfSubFromCalculator = calculator.sub(a,b);
        Assert.assertEquals(resultOfSubFromCalculator, subResult, "Calculation of subtraction for DataProvider values is incorrect");
    }

    @DataProvider(name = "valuesForSub") // TODO: 11/04/2021 ask about move DataProvider to BaseTest or smth like that, or use the same DataProvider for different methods, sum,sub,etc...
    public Object[][] dataProviderForSum() {
        return new Object[][]{
                {4, 2},
                {-10, -5},
                {0,0},
                {0,1},
                {1,0},
                {-5,5},
                {5,-5}
        };
    }


}
