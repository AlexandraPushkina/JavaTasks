package Homework3.task_2;

public class Main {
    public static void main() {
        Employee[] employees = new Employee[]{
                new Employee("Иванов Иван Иванович", "Программист", "ivan@mail.com", "+7(999)-123-45-67", 80000, 35),
                new Employee("Петрова Анна Сергеевна", "Менеджер", "anna@mail.com", "+7(943)-987-65-43", 60000, 45),
                new Employee("Сидоров Петр Алексеевич", "Аналитик", "petr@mail.com", "+7(975)-755-57-15", 75000, 50),
                new Employee("Кузнецова Мария Владимировна", "Дизайнер", "maria@mail.com", "+7(931)-111-92-33", 70000, 30),
                new Employee("Смирнов Дмитрий Николаевич", "Тестировщик", "dima@mail.com", "+7(972)-444-59-15", 65000, 42)
        };

            System.out.println("\nСотрудники старше 40 лет:");
            for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
