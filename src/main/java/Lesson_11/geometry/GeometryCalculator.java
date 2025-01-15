package main.java.Lesson_11.geometry;

public class GeometryCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Белый");
        Triangle triangle = new Triangle(3, 4, 5, "Зеленый", "Черный");

        System.out.println("Круг:");
        circle.printInfo();

        System.out.println("\nПрямоугольник:");
        rectangle.printInfo();

        System.out.println("\nТреугольник:");
        triangle.printInfo();
    }
}