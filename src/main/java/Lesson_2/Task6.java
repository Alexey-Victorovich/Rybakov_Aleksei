package main.java.Lesson_2;

import java.util.Scanner;

public class Task6 {
    public static void checkNumber(int num) {
        if (num >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num = scanner.nextInt();
        checkNumber(num);
        scanner.close();
    }
}


/*
public class Task6 {
    public static String checkNumber(int num) {
        if (num >= 0) {
            return "Положительное число";
        } else {
            return "Отрицательное число";
        }
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Число " + a + " - " + checkNumber(a));
    }
}
*/
