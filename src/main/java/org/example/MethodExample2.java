package org.example;
import java.util.Scanner;

public class MethodExample2 {
//Enter the number and name from the keyboard. Display the following string:
//<name> will be an automation tester in <number> months!
    public static void main (String[] args){

        Scanner scannerName = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = scannerName.nextLine();

        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Please enter the number of months: ");
        int monthsNumber = scannerNumber.nextInt();

        System.out.println(firstName + " will be an automation tester in " + monthsNumber + " months!");
        }
}
