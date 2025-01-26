package Lesson_14_junit_5;

public class FactorialCalculator {
    public static long factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("Факториал не определен для отрицательных чисел");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}