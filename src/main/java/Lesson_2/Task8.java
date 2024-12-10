package main.java.Lesson_2;

import java.util.Scanner;

public class Task8 {
    public static void stringRepeater(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println("Введите количество раз:");
        int count = scanner.nextInt();
        scanner.close();
        stringRepeater(str, count);
    }
}


/*
public class Task8 {
    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        printString("Hello, World!", 5);
    }
}
 */
