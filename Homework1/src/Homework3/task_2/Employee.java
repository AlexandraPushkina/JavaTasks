package Homework3.task_2;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private short age;

    public Employee(String fullName, String position, String email, String phone, double salary, short age) {
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
