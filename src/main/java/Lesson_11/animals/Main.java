package main.java.Lesson_11.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.run(300);
        dog.swim(5);

        Cat[] cats = {new Cat("Вася"), new Cat("Петя"), new Cat("Коля")};
        for (Cat cat : cats) {
            cat.run(20);
        }

        FoodBowl bowl = new FoodBowl(20);
        for (Cat cat : cats) {
            cat.eat(bowl, 5);
            System.out.println("Кот " + cat.name + " голоден: " + cat.isHungry());
        }

        System.out.println("Создано животных: " + Animal.count);
    }
}