package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @DataProvider(name = "divProvider")
    public static Object[][] numbersForDiv() {
        return new Object[][]{{1, 7, 1.0 / 7}, {77, 7, 77 / 7}};
    }

    @Test(dataProvider = "divProvider")
    public void doubleNumbersDivTest(double s1, double s2, double div) {
        Assert.assertEquals(calculator.div(s1, s2), div);
    }
}
