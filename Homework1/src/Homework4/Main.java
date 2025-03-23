package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(){

        //Задание 1 - Массив слов
        String[] fruitsArray = {"apple", "peach", "orange",
                "apple", "grape", "banana",
                "kiwi", "orange", "apple",
                "mango", "grape", "apple"};

        ArrayWords fruits = new ArrayWords(fruitsArray);
        fruits.getWordsCount();
        System.out.println("Only unique words");
        fruits.printUniqueCount();
        System.out.println("All words: ");
        fruits.printWordsCount();

        //Задание 2 - Телефонный справочник
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить запись");
            System.out.println("2. Найти номер по фамилии");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите фамилию: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введите номера телефонов через пробел: ");
                    String phoneNumbersStr = scanner.nextLine();

                    Integer[] phoneNumbers = Arrays.stream(phoneNumbersStr.split(" "))
                            .map(Integer::parseInt)
                            .toArray(Integer[]::new);


                    phoneBook.add(lastName, phoneNumbers);
                    System.out.println("Запись добавлена.");
                    break;

                case 2:
                    System.out.print("Введите фамилию для поиска: ");
                    String searchLastName = scanner.nextLine();
                    Integer[] foundNumbers = phoneBook.get(searchLastName);

                    if (foundNumbers != null) {
                        System.out.println("Номера телефонов для " + searchLastName + ":");
                        for (Integer number : foundNumbers) {
                            System.out.println(number);
                        }
                    } else {
                        System.out.println("Записи для фамилии " + searchLastName + " не найдены.");
                    }
                    break;

                case 3:
                    System.out.println("Программа завершена.");
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");

            }
        }
    }
}
