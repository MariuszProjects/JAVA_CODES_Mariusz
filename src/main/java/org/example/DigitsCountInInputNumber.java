package org.example;
import java.util.Scanner;
public class DigitsCountInInputNumber {
//Create a method which will return the number of digits in a passed number.
//Input: 91231
//Output: 5

public static void main(String[] args){
    Scanner numberOfDigits = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int number = numberOfDigits.nextInt();

    String stringNumber = Integer.toString(number);
    System.out.println("Number of digits in the number is: " + stringNumber.length());
}
}

