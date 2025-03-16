package Homework2;
import java.util.Scanner;

public class task_1 {

    public static int number;

    public static void GuessTheNumber() {
        boolean victory = false;

        int max = 10;
        System.out.println("Generated the number! Try to guess it");
        number = (int) (Math.random() * ++max);
        while (!victory){
            System.out.println("Your answer is...");
            Scanner userNumber = new Scanner(System.in);
            int intUserNumber = userNumber.nextInt();
            if (intUserNumber == number){
                System.out.println("Congratulations! You guessed it! My number was " + number);
                victory = true;
            } else if (intUserNumber > number) {
                System.out.println("Your answer is higher than you guessed!");
            }
            else {
                System.out.println("Your answer is lower than you guessed!");
            }
        }
    }
}
