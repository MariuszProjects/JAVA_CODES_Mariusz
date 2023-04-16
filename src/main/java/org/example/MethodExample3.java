package org.example;
import java.util.Scanner;
public class MethodExample3 {
//Implement a method that will take two arguments – String s and int n, and return s multiplied by n times.
//  Input: “Course”, 3
//  Output: Course Course Course

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String inputString = string.nextLine();
        System.out.println("Please enter your multiplier to repeat the string: ");
        int n = string.nextInt();
        System.out.println("Output string: " + listOfStrings(inputString,n));
        }
     public static String listOfStrings(String inputString, int n){
        String output = "";
        for (int i=1; i<=n; i++){
            output = output + inputString + " ";
        }
        return output;
}
}

