package Homework5;

// Main.java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    // 1. Метод для обмена элементов массива
    public static <T> void swapElements(T[] arr, int index1, int index2) {
        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("Индексы вне диапазона массива.");
            return;
        }
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // 3. Метод для проверки строки на число и выброса исключения
    public static void checkStringForNumber(String str)
        throws Exception {
            Pattern pattern = Pattern.compile("\\d+"); // Регулярное выражение для поиска чисел
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                throw new Exception("Строка не должна содержать число!");
            }
    }

    public static void main(String[] args) throws Exception {

        //1 swap elements in array
        String[] stringArray = {"one", "two", "three"};
        System.out.println("Исходный массив строк: " + java.util.Arrays.toString(stringArray));
        swapElements(stringArray, 0, 2);
        System.out.println("Массив строк после обмена: " + java.util.Arrays.toString(stringArray));

        Integer[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив чисел: " + java.util.Arrays.toString(integerArray));
        swapElements(integerArray, 0, 3);
        System.out.println("Массив чисел после обмена: " + java.util.Arrays.toString(integerArray));

        //2 box class
        Box<String, Integer, Float> box1 = new Box<>("Box 1", 10, 20.5f);
        Box<String, Integer, String> box2 = new Box<>("Box 2", 15, "25.7f");
        Box<Float, Float, Integer> box3 = new Box<>(44f, 11.1f, 55);

        box1.count();
        box2.count();
        box3.count();

        //3 string without digits
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        checkStringForNumber(inputString);


    }
}
