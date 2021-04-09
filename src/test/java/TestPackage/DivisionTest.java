package TestPackage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class DivisionTest extends BaseTest {

    @Test
    public void divisionRandomLongValues(){
        long a = new Random().nextLong();
        long b = new Random().nextLong();
        long r = a/b;
        long divisionResult = calculator.div(a,b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid long values is incorrect");
    }

    @Test
    public void divisionRandomDoubleValues(){
        double a = new Random().nextDouble();
        double b = new Random().nextDouble();
        double r = a/b;
        double divisionResult = calculator.div(a,b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid double values is incorrect");
    }

    @Test
    public void divisionRandomIntValues(){
        int a = new Random().nextInt();
        int b = new Random().nextInt();
        int r = a/b;
        double divisionResult = calculator.div(a,b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid int values is incorrect");
    }

    @Test
    public void divisionRandomFloatValues(){
        float a = (float) 3.5;
        float b = (float) 3.5;
        float r = a/b;
        float divisionResult = (float) calculator.div(a,b);
        Assert.assertEquals(divisionResult, r, "Calculation with random valid values values is incorrect");
    }

    @Test (expectedExceptions = {NumberFormatException.class}, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divisionByZeroLong() throws Exception {
        long a = new Random().nextLong();
        long r = calculator.div(a,0L);
        Assert.assertEquals(r,0L);
        throw new Exception();
    }

    @DataProvider(name = "asd")
    public Object[][] dataProviderForDivision(){
        return new Object[][]{
                {4,2,2},
                {-10,-5,2}
        };
    }
}
