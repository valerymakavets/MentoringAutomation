package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalTest extends BaseTest {

    @Test
    public void subCalculationTestTwentyOneMinusNineteen(){
        long result = calculator.sub(21,19);
        Assert.assertEquals(result,2,"Calculation is incorrect");
    }

}
