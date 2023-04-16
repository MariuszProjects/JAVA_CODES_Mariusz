package org.example;
import java.util.Scanner;

public class ConditionExample2 {
//Use the keyboard to enter a year, and then determine the number of days in the year.
// For a leap year – 366, for an ordinary one – 365.
    public static void main(String[] args) {
        Scanner yearScanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = yearScanner.nextInt();

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is the leap year, the number of days is: 366");
        } else {
            System.out.println("The year is an ordinary year, the number of days is: 365");
        }
    }
}
