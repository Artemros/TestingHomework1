package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest {
    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @DataProvider(name = "powProvider")
    public static Object[][] numbersForPow() {
        return new Object[][]{{3, 7, Math.pow(3, 7)}};
    }

    @Test(dataProvider = "powProvider")
    public void doubleNumbersPowTest(double s1, double s2, Double pow) {
        Assert.assertEquals(calculator.pow(s1, s2), pow);
    }
}
