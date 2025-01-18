package main.java.Lesson_13.task_2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Иванов", "890-12-34");
        phoneBook.add("Петров", "567-89-01");
        phoneBook.add("Сидоров", "234-56-78");

        phoneBook.printPhones("Иванов");
        phoneBook.printPhones("Петров");
        phoneBook.printPhones("Сидоров");

        phoneBook.update("Иванов", "123-45-67", "111-22-33");
        System.out.println("Обновленные телефоны Ивановых:");
        phoneBook.printPhones("Иванов");

        phoneBook.remove("Петров", "567-89-01");
        System.out.println("Обновленные телефоны Петровых:");
        phoneBook.printPhones("Петров");

        System.out.println("Все записи в справочнике:");
        phoneBook.printAll();
    }
}