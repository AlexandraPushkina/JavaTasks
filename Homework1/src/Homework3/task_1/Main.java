package Homework3.task_1;

public class Main {
    public static void main() {
        // Задание 1
        Cat Felix = new Cat("Felix");
        Dog Jack = new Dog("Jack");

        Felix.run(150);
        Felix.swim(5);
        Felix.run(75);  // Не сможет пробежать
        Jack.run(5);
        Jack.run(100);
        Jack.run(600);  // Не сможет пробежать
        Jack.swim(10);
        Jack.run(10);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
    }
}