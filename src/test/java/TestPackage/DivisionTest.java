package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;

public class DivisionTest extends BaseTest {

    @Test
    public void divisionRandomLongValues() {
        long a = 9223372036854775807L;
        long b = -9223372036854775808L;
        long r = a / b;
        long divisionResult = calculator.div(a, b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid long values is incorrect");
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


    /*@Test
    public void divisionByZeroDouble(){
        double a = Double.MAX_VALUE;
        double r = calculator.div(a,0D);
        Assert.assertEquals(r,Infinity);
    }

    @Test
    public void divisionZeroByZeroDotZeroDouble(){
        double r = calculator.div(0,0.0D);
        Assert.assertEquals(r,NaN);
        System.out.println(r);
    }


    @Test(expectedExceptions = {NumberFormatException.class}, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divisionByZeroDouble2() throws Exception {
        double a = new Random().nextDouble();
        double r = calculator.div(a, 0D);
        Assert.assertEquals(r, 0);
        throw new Exception();
    }*/
}
