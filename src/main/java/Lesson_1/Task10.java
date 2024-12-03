package main.java.Lesson_1;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Оригинальный массив:");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }
        System.out.println("Массив после замены:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}