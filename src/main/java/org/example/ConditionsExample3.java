package org.example;
import java.util.Scanner;
public class ConditionsExample3 {
//Use the keyboard to enter an integer. Display information on the console whether it’s a
//positive/negative and even/odd number, or 0. Run the program until user provides number 1000.
//Input: -15
//Output: Negative, odd number.

    public static void main(String[] args) {

        Scanner guessNumber = new Scanner(System.in);
        System.out.println("Enter an inteager: ");
        int number = guessNumber.nextInt();

        if (number == 1000) {
            do {
                break;
            } while (number == 1000);
        }
              if (number % 2 == 0 && number > 0) {
                System.out.println("Positive, even number.");
                System.out.println();
            } else if (number % 2 != 0 && number < 0) {
                System.out.println("Negative, odd number.");
                System.out.println();
            } else if (number % 2 == 0 && number < 0) {
                System.out.println("Negative, even number.");
                System.out.println();
            } else if (number == 0) {
                System.out.println("The number is 0.");
                System.out.println();
            } else {
               System.out.println("Positive, odd number.");
                System.out.println();
           }


    }
}

