package Homework3.task_1;

//Класс-предок, от которого наследуются КОт и Собака
public abstract class Animal {
    private static int animalCount = 0;
    protected String name;
    private int runDistance = 0;
    private int swimDistance = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    protected void incrementRunDistance(int distance) {
        this.runDistance += distance;
    }

    protected void incrementSwimDistance(int distance) {
        this.swimDistance += distance;
    }

    protected int getRunDistance(){
        return this.runDistance;
    }

    protected int getSwimDistance(){
        return this.swimDistance;
    }

    protected String getClassName() {
        return this.getClass().getSimpleName();
    }

}