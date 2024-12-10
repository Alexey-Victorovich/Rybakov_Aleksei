package main.java.Lesson_2;

import java.util.Scanner;

public class Task7 {
    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num = scanner.nextInt();
        System.out.println(isNegative(num));
        scanner.close();
    }
}