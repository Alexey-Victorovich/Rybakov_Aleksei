package test.java.Lesson_14_testng;

import main.java.Lesson_14_testng.FactorialCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        long result = FactorialCalculator.factorial(0);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testFactorialOfOne() {
        long result = FactorialCalculator.factorial(1);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long result = FactorialCalculator.factorial(5);
        Assert.assertEquals(result, 120);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}