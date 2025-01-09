package main.java.Lesson_11;

public class Main {
    public static abstract class Animal {
        protected String name;
        protected static int count = 0;

        public Animal(String name) {
            this.name = name;
            count++;
        }

        public abstract void run(int distance);
        public abstract void swim(int distance);
    }

    public static class Dog extends Animal {

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

    public static class Cat extends Animal {
        private boolean isHungry = true;

        public Cat(String name) {
            super(name);
        }

        @Override
        public void run(int distance) {
            if (distance <= 200) {
                System.out.println("Кот " + name + " пробежал " + distance + " м.");
            } else {
                System.out.println("Кот " + name + " не может пробежать такую дистанцию.");
            }
        }

        @Override
        public void swim(int distance) {
            System.out.println("Кот " + name + " не умеет плавать.");
        }

        public void eat(FoodBowl bowl, int amount) {
            if (bowl.getFood() >= amount) {
                bowl.setFood(bowl.getFood() - amount);
                isHungry = false;
                System.out.println("Кот " + name + " покушал.");
            } else {
                System.out.println("Кот " + name + " не может покушать, не хватает еды.");
            }
        }

        public boolean isHungry() {
            return isHungry;
        }
    }

    public static class FoodBowl {
        private int food;

        public FoodBowl(int food) {
            this.food = food;
        }

        public int getFood() {
            return food;
        }

        public void setFood(int food) {
            if (food < 0) {
                this.food = 0;
            } else {
                this.food = food;
            }
        }

        public void addFood(int amount) {
            if (amount > 0) {
                food += amount;
            }
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.run(150);
        dog.swim(5);

        Cat[] cats = {new Cat("Вася"), new Cat("Петя"), new Cat("Коля")};
        FoodBowl bowl = new FoodBowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl, 5);
            System.out.println("Кот " + cat.name + " голоден: " + cat.isHungry());
        }

        System.out.println("Создано животных: " + Animal.count);
    }
}