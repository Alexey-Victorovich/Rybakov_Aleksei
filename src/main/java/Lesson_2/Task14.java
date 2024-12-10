package main.java.Lesson_2;

import java.util.Scanner;
import static java.util.Arrays.fill;

public class Task14 {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        fill(array, initialValue);
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("len ");
        int len = scanner.nextInt();
        System.out.print("initialValue ");
        int initialValue = scanner.nextInt();
        int[] array = createArray(len, initialValue);
        System.out.println("Массив:");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}