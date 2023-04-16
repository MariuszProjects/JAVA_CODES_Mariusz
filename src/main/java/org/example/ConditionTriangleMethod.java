package org.example;
import java.util.Scanner;

public class ConditionTriangleMethod {
//Use the keyboard to enter three numbers a, b, and c (the lengths of the sides of the proposed triangle).
// Determine whether a triangle with these sides can exist.
// Display the result as follows:
// "The triangle is possible." – if a triangle with these sides could exist.
// "The triangle is not possible." – if a triangle with these sides cannot exist.

    public static void main(String[] args){

        Scanner triangleScanner = new Scanner(System.in);
        System.out.println("Enter first lenght: ");
        int a = triangleScanner.nextInt();

        System.out.println("Enter second lenght: ");
        int b = triangleScanner.nextInt();

        System.out.println("Enter third lenght: ");
        int c = triangleScanner.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("The triangle is possible to be created.");
        } else {
            System.out.println("The triangle is not possible to be created.");
        }
    }
}
