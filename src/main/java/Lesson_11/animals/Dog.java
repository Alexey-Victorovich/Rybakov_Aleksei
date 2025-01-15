package main.java.Lesson_11.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака " + name + " пробежала " + distance + " м.");
        } else {
            System.out.println("Собака " + name + " не может пробежать такую дистанцию.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака " + name + " проплыла " + distance + " м.");
        } else {
            System.out.println("Собака " + name + " не может проплыть такую дистанцию.");
        }
    }
}