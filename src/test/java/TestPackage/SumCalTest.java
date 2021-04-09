package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SumCalTest extends BaseTest {

    @Test
    public void nameOfTestFourPlusSeven() {
        long a = new Random().nextLong();
        long b = new Random().nextLong();
        long r = a + b;
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, r, "Calculation is incorrect");
    }

    @Test(dependsOnMethods = "nameOfTestFourPlusSeven", description = "nedotest", invocationCount = 2)
    public void test3StringValue() {
        int a = new Random().nextInt();
        long b = new Random().nextLong();
        long r = a + b;
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, r, "Calculation is incorrect");
    }



}
