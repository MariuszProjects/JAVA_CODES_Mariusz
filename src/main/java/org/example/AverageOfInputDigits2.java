package org.example;
import java.util.Scanner;
public class AverageOfInputDigits2 {
//Use keyboard to enter numbers until user types "exit". Then display the average of all entered
//numbers excluding the last one.
        public static void main(String[] args) {

        Scanner avgDigits2 = new Scanner(System.in);
        int sum = 0;
        int number;
        int counter = 0;

        while (true) {
            System.out.println("Please enter the integers. If you want to average them, type 'exit': ");
            String numberString = avgDigits2.nextLine();
            if (numberString.equals("exit")) break;
            int number1 = Integer.parseInt(numberString);
            number = number1;
            sum += number;
            counter++;
        }
        System.out.println("The average of entered numbers is: " + calcAverage(sum, counter));
    }
    static double calcAverage(int sum, int counter) {
        return sum / counter;
    }
}
