package main.java.Lesson_2;

import java.util.Scanner;

public class Task9 {
    public static boolean leapYearDeterminant(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        scanner.close();
        System.out.println(leapYearDeterminant(year));
    }
}