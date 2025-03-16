package Homework1.src;

public class Main {
    public static void main() {
        System.out.println("Task 1 - Data Types");
        task_1 dataTypes = new task_1();
        dataTypes.printDataTypes();
        System.out.println("Task 2 - Greetings");
        task_2.greet("Alexandra Pushkina");
        System.out.println("Task 3 - Negative or Positive Numbers");
        System.out.println(task_3.IsNegativeMy(4));
        System.out.println(task_3.IsNegativeMy(0));
        System.out.println(task_3.IsNegativeMy(-5));
        System.out.println("Task 4 - Print Negative or Positive Numbers");
        task_4.PrintNegativeOrPositive(3);
        task_4.PrintNegativeOrPositive(-6);
        System.out.println("Task 5 - Print Sequence");
        task_5.printSequence();
    }
}
