package main.java.Lesson_2;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, double price) {
        Attraction attraction = new Attraction(name, workingHours, price);
        attractions.add(attraction);
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }

    public static class Attraction {
        private final String name;
        private final String workingHours;
        private final double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Веселые горки", "10:00 - 18:00", 50.0);
        park.addAttraction("Лодочки", "09:00 - 20:00", 30.0);
        park.addAttraction("Вальс", "11:00 - 22:00", 40.0);

        park.printAttractions();
    }
}
