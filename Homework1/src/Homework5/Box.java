package Homework5;

public class Box<T, U, V> {
    private final T value1;
    private final U value2;
    private final V value3;

    public Box(T value1, U value2, V value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public double count() {
        double sum = 0;

        if (getValue1() instanceof Number) {  //Используем проверку на число, так как класс с параметризованными типами
            sum += ((Number) getValue1()).doubleValue();
        }
        if (getValue2() instanceof Number) {
            sum += ((Number) getValue2()).doubleValue();
        }
        if (getValue3() instanceof Number) {
            sum += ((Number) getValue3()).doubleValue();
        }
        System.out.println("Сумма чисел в коробке: " + sum);
        return sum;
    }

    public T getValue1() { return value1;}
    public U getValue2() { return value2;}
    public V getValue3() { return value3;}

}
