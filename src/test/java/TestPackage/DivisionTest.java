package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class DivisionTest extends BaseTest {

    @Test
    public void divisionRandomLongValues() {
        long a = new Random().nextLong();
        long b = new Random().nextLong();
        long r = a / b;
        long divisionResult = calculator.div(a, b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid long values is incorrect");
    }

    @Test
    public void divisionRandomDoubleValues() {
        double a = new Random().nextDouble();
        double b = new Random().nextDouble();
        double r = a / b;
        double divisionResult = calculator.div(a, b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid double values is incorrect");
    }

    @Test
    public void divisionRandomIntValues() {
        int a = new Random().nextInt();
        int b = new Random().nextInt();
        int r = a / b;
        double divisionResult = calculator.div(a, b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid int values is incorrect");
    }

    @Test
    public void divisionRandomFloatValues() {
        float a = (float) 3.5;
        float b = (float) 3.5;
        float r = a / b;
        float divisionResult = (float) calculator.div(a, b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid float values is incorrect");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divisionByZeroLongCheckExceptionMethod() {
        long a = new Random().nextLong();
        calculator.div(a, 0L);
    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divisionByZeroLongCheckExceptionText() {
        long a = new Random().nextLong();
        calculator.div(a, 0L);
    }


    /*@Test todo "ask about this check"
    public void divisionByZeroDouble(){
        double a = new Random().nextDouble();
        double r = calculator.div(a,0D);
        Assert.assertEquals(r,0);
    }

    @Test(expectedExceptions = {NumberFormatException.class}, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divisionByZeroDouble2() throws Exception {
        double a = new Random().nextDouble();
        double r = calculator.div(a, 0D);
        Assert.assertEquals(r, 0);
        throw new Exception();
    }*/
}
