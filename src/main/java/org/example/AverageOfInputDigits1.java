package org.example;
import java.util.Scanner;
public class AverageOfInputDigits1 {
//Use keyboard to enter numbers until user enters -1. Then display the average of all entered
//numbers excluding the last one.
    public static void main(String[] args) {
        Scanner avgDigits = new Scanner(System.in);
        double sum = 0;
        int number;
        int counter = 0;

        while (true) {
            System.out.println("Please enter a integer numbers. If you want to average them press '-1': ");
            number = avgDigits.nextInt();
            if (number == -1) break;
            sum += number;
            counter++;
        }
        System.out.println("The average of entered numbers is: " + calcAverage(sum, counter));
      }
    static double calcAverage(double sum, int counter){
        return sum/counter;
    }
}
