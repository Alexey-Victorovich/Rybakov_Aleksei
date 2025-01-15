package main.java.Lesson_12;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "к", "16"}
        };

        try {
            int sum = ArrayCalculator.calculateSum(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка преобразования элемента в int: строка " + (e.getRow() + 1) + ", столбец " + (e.getCol() + 1));
            System.out.println("Невозможно преобразовать элемент в int");
        }
    }
}