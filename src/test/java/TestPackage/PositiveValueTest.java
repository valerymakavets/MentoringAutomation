package TestPackage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveValueTest extends BaseTest{

    @Test (dataProvider = "values")
    public void positiveValueCheck(long a){
        boolean b = calculator.isPositive(a);
        Assert.assertTrue(b);
    }

    @Test (dataProvider = "values") //todo: Ask, is it ok to test positive and negative in one class
    public void negativeValueCheck(long a){
        boolean b = calculator.isNegative(a);
        Assert.assertTrue(b);
    }

    @DataProvider(name = "values") //todo: Ask, which values need to test, and should we use values which will failed in test
    public Object[][] dataProviderForPositive() {
        return new Object[][]{
                {4},
                {-10},
                {0},
                {1}
        };
    }
}
