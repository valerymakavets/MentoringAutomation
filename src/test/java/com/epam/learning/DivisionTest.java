package com.epam.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static java.lang.Double.NaN;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class DivisionTest extends BaseTest {

    // TODO: Take a look at the variable names and refactor the other methods.
    @Test
    public void divisionRandomLongValues() {
        long value1 = Long.MAX_VALUE;
        long value2 = Long.MIN_VALUE;
        long result = value1 / value2;
        long divisionResult = calculator.div(value1, value2);
        Assert.assertEquals(divisionResult, result, "Calculation with random valid long values is incorrect");
    }

    @Test
    public void divisionRandomDoubleValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double result = firstValue / secondValue;
        double divisionResult = calculator.div(firstValue, secondValue);
        Assert.assertEquals(divisionResult, result, "Calculation with random valid double values is incorrect");
    }

    @Test
    public void divisionRandomIntValues() {
        int value = 10;
        double divisionResult = calculator.div(value, value);
        Assert.assertEquals(divisionResult, 1, "Calculation with random valid int values is incorrect");
    }

    // instead of (float) you can use f (or F)
    @Test
    public void divisionRandomFloatValues() {
        float value = 3.5F;
        float divisionResult = (float) calculator.div(value, value);
        Assert.assertEquals(divisionResult, 1, "Calculation with random valid float values is incorrect");
    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divisionByZeroLongCheckExceptionText() {
        long value = Long.MAX_VALUE;
        calculator.div(value, 0L);
    }

    @Test
    public void divisionByZeroDouble() {
        double value = Double.MAX_VALUE;
        double result = calculator.div(value, 0D);
        Assert.assertEquals(result, Infinity);
    }

    @Test
    public void divisionZeroByZeroDotZeroDouble() {
        double r = calculator.div(0, 0.0D);
        Assert.assertEquals(r, NaN);
    }
}
