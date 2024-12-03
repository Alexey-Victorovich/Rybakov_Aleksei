// Доброго дня, Сергей!
// Если честно, я не совсем понял условия задачи,
// если метод принимает на вход два целых числа, то я должен
// для работы с потоком ввода создать объект класса Scanner,
// но с другой стороны в условиях задачи не сказано, что нужно реализовать Scanner
// поэтому написал два варианта (второй вариант ниже закомментирован).
// в остальных задачах тоже по 2 варианта.

package main.java.Lesson_1;

import java.util.Scanner;

public class Task5 {
    public static boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое число:");
        int a = scanner.nextInt();
        System.out.println("Второе число:");
        int b = scanner.nextInt();
        boolean result = checkSum(a, b);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }
}

/*
public class Task5 {
    public static boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        System.out.println(checkSum(a, b));
    }
}
*/