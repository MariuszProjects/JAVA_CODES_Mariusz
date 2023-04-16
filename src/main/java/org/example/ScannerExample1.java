package org.example;
import java.util.Scanner;
public class ScannerExample1 {
//Use keyboard to enter a name and 3 numbers (year, month and a day). Display data in the following format:
//“My name is {name}, I was born on day/month/year.”
    public static void main(String[] args){
        Scanner displayMyData = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = displayMyData.nextLine();

        System.out.println("Please enter the year you were born: ");
        int year = displayMyData.nextInt();

        System.out.println("Please enter the month you were born: ");
        int month = displayMyData.nextInt();

        System.out.println("Please enter the day you were born: ");
        int day = displayMyData.nextInt();

        System.out.println("My name is " + firstName + ", I was born on "+ day + "/" + month +"/"+ year);
    }
}

