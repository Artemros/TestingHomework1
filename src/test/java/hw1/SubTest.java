package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTest {
    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @DataProvider(name = "subProvider")
    public static Object[][] numbersForSub() {
        return new Object[][]{{3.4, 2.1, 3.4 - 2.1}, {0.0, 0.0, 0.0 - 0.0}};
    }

    @Test(dataProvider = "subProvider")
    public void doubleNumbersSubTest(double s1, double s2, double sub) {
        Assert.assertEquals(calculator.sub(s1, s2), sub);
    }
}
