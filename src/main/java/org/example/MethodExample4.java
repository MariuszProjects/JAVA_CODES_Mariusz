package org.example;
import java.util.Scanner;

public class MethodExample4 {
//Implement a method that will take a list of Strings as a parameter and return a list with doubled values.
//Input: “uno”, “dos”, “tres”
//Output: “uno”, “uno”, “dos”, “dos”, “tres”, “tres”
public static String listOfString(String inputString){
                String output = "";
                return output = inputString;
}

public static void main(String [] args){
    Scanner string = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String inputString = string.nextLine();
    System.out.println("Output string: " + listOfString(inputString)+ " " + listOfString(inputString));
}
}
