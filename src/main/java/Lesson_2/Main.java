package main.java.Lesson_2;
/* В задаче нейминг приведен как "Person", но это лишь пример. Для лучшего понимания и прослеживаемости кода
я использую текущий нейминг "Employee", чтобы четко указать что класс представляет сотрудников, а не просто людей,
связан с сотрудниками, их должностями, зарплатами и т.д.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Мусофранов Михаил", "Менеджер", "musofr@example.com", "892312312", 30000, 50);
        employees[1] = new Employee("Рогоз Игорь", "Программист", "rog@example.com", "892312313", 40000, 35);
        employees[2] = new Employee("Босонченко Андрей", "Дизайнер", "boss@example.com", "892312314", 50000, 28);
        employees[3] = new Employee("Майская Лидия", "Маркетолог", "mayali@example.com", "892312315", 60000, 32);
        employees[4] = new Employee("Юлегин Михаил", "Менеджер", "mikhailyu@example.com", "892312316", 70000, 40);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
    }
}