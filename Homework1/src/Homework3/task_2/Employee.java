package Homework3.task_2;

public class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        if (salary > 1) {
            this.salary = salary;
        }
        if (age >= 18) {
            this.age = age;
        }

    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName +
                "\nДолжность: " + position +
                "\nEmail: " + email +
                "\nТелефон: " + phone +
                "\nЗарплата: " + salary +
                "\nВозраст: " + age);
        System.out.println("--------------------");
    }
}
