package org.example;
import java.time.Year;

public class MethodsExample1 {
//Write a program that displays the square of current year on the screen.
    public static void main(String[] args) {
        int year = Year.now().getValue();
        System.out.println(squaredYear(year));
    }
    public static int squaredYear(int year) {
        return year * year;
    }
}

