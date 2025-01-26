package Lesson_14_junit_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialPositiveNumber() {
        int number = 5;
        long expected = 120;
        long result = FactorialCalculator.factorial(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFactorialZero() {
        int number = 0;
        long expected = 1;
        long result = FactorialCalculator.factorial(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFactorialOne() {
        int number = 1;
        long expected = 1;
        long result = FactorialCalculator.factorial(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFactorialNegativeNumber() {
        int number = -5;
        ArithmeticException expected = assertThrows(ArithmeticException.class, () -> FactorialCalculator.factorial(number));
        assertEquals("Факториал не определен для отрицательных чисел", expected.getMessage());
    }
}