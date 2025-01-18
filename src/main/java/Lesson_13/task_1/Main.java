package main.java.Lesson_13.task_1;

public class Main {
    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords();
        String[] cars = {"Toyota", "Honda", "Toyota", "Ford", "Honda", "Nissan", "Toyota", "Mazda", "Ford", "Nissan"};
        uniqueWords.processWords(cars);
    }
}
