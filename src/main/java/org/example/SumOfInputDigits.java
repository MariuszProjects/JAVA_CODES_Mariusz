package org.example;
import java.util.Scanner;
public class SumOfInputDigits {
//Read numbers from the keyboard and after typing number 0, display the sum of all previously provided numbers.

    public static void main(String[] args) {
        Scanner sumDigits = new Scanner(System.in);
        int sum = 0;
        int digit;

       do {
           System.out.println("Please enter an integer, if you want to sum the numbers, press '0': ");
           digit = sumDigits.nextInt();
           sum+=digit;
       }
       while (digit !=0);
        System.out.println("The sum of entered numbers is: "+ sum);
    }
}


