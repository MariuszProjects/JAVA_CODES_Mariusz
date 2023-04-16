package org.example;
import java.util.Scanner;

public class Sum4DigitsMethod {
//Write the code for sumDigits(int number). You need to calculate the sum of four digits of this
//number, and then return the result.
    public static void main(String[] args) {
        Scanner sum4Digits = new Scanner(System.in);
        System.out.println("Please provide 4 digit number");
        int number = sum4Digits.nextInt();

        if (number > 9999 || number < 1000){
        System.out.println("The number is wrong");
        System.out.println("Please try again and provide 4 digit number, re-run the program");
    }
        else {
            System.out.println("The sum of entered digits of the number is: ");
            System.out.println(sumDigits(number));
            }
    }
    public static int sumDigits(int number) {
        int a = number / 1000;
        int b = (number / 100) % 10;
        int c = (number / 10) % 10;
        int d = number % 10;
        return a + b + c + d;
    }
}


