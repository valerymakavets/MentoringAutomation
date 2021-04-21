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
        double a = Double.MAX_VALUE;
        double b = Double.MIN_VALUE;
        double r = a / b;
        double divisionResult = calculator.div(a, b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid double values is incorrect");
    }

    @Test
    public void divisionRandomIntValues() {
        int a = 10;
        double divisionResult = calculator.div(a, a);
        Assert.assertEquals(divisionResult, 1, "Calculation with random valid int values is incorrect");
    }

    // instead of (float) you can use f (or F)
    @Test
    public void divisionRandomFloatValues() {
        float a = (float) 3.5;
        float b = (float) 3.5;
        float divisionResult = (float) calculator.div(a, b);
        Assert.assertEquals(divisionResult, 1, "Calculation with random valid float values is incorrect");
    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divisionByZeroLongCheckExceptionText() {
        long a = Long.MAX_VALUE;
        calculator.div(a, 0L);
    }

    @Test
    public void divisionByZeroDouble() {
        double a = Double.MAX_VALUE;
        double r = calculator.div(a, 0D);
        Assert.assertEquals(r, Infinity);
    }

    // TODO: This test can be deleted as it does not cover the Calculator class functionality.
    //  You can use System.out.println() for debug while writing your tests, but in real tests
    //  or program you should use logging instead. So, do not overuse it now in your code.
    //  Moreover, in this example after Assert the program will be finished, you will never
    //  reach the line of code
    @Test
    public void divisionZeroByZeroDotZeroDouble() {
        double r = calculator.div(0, 0.0D);
        Assert.assertEquals(r, NaN);
        System.out.println(r);
    }


    // TODO: delete all unused methods
    @Test(expectedExceptions = {NumberFormatException.class}, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divisionByZeroDouble2() throws Exception {
        double a = new Random().nextDouble();
        double r = calculator.div(a, 0D);
        Assert.assertEquals(r, 0);
        throw new Exception();
    }
}
