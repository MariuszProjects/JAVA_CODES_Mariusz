package org.example;
import java.util.Scanner;

public class FizzBuzzScanner {
    public static void main(String[] args) {
        Scanner enterNumber = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = enterNumber.nextInt();
            if (number % 15 == 0) {
                System.out.println("FizzBuzz - the integer can be divided by 3 & 5");
            }
            else if (number % 3 == 0) {
                System.out.println("Fizz - the integer can be divided by 3");
            }
            else if (number % 5 == 0) {
                System.out.println("Buzz - the integer can be divided by 5");
            }
            else System.out.println(number);
        }
    }

