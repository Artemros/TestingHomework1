package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumTest {
    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @DataProvider(name = "sumProvider")
    public static Object[][] numbersForSum() {
        return new Object[][]{{3, 4, 3 + 4}, {0, 0, 0 + 0}, {-5, 2, -5 + 2}};
    }

    @Test(dataProvider = "sumProvider")
    public void longNumbersSumTest(long s1, long s2, long sum) {
        Assert.assertEquals(calculator.sum(s1, s2), sum);
    }
}
