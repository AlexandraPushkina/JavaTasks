package Homework3.task_1;

public class Cat extends Animal {
    private static int catCount = 0;
    private final int maxRunDistance = 200;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (getRunDistance() + distance <= maxRunDistance) {
            incrementRunDistance(distance);
            System.out.println(getClassName() + " " + name + " пробежал " + distance + " м. Всего пробежал: " + getRunDistance() + " м.");
        } else {
            int remainingDistance = maxRunDistance - getRunDistance();
            incrementRunDistance(remainingDistance);
            System.out.println(getClassName() + " " + name + " пробежал " + remainingDistance + " м. Достигнут предел в " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getClassName() + " " + name + " не умеет плавать.");
    }
}