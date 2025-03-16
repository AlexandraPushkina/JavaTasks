package Homework3.task_1;

public class Dog extends Animal {
    private static int dogCount = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
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
        if (getSwimDistance() + distance <= maxSwimDistance) {
            incrementSwimDistance(distance);
            System.out.println(getClassName() + " " + name + " проплыл " + distance + " м. Всего проплыл: " + getSwimDistance() + " м.");
        } else {
            int remainingDistance = maxSwimDistance - getSwimDistance();
            incrementSwimDistance(remainingDistance);
            System.out.println(getClassName() + " " + name + " проплыл " + remainingDistance + " м. Достигнут предел в " + maxSwimDistance + " м.");
        }
    }
}