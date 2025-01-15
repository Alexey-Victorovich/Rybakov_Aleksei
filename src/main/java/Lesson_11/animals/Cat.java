package main.java.Lesson_11.animals;

public class Cat extends Animal {
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
