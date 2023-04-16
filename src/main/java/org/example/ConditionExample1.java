package org.example;
import java.util.Scanner;

public class ConditionExample1 {

//Use the keyboard to enter a number. If the number is positive, then double it. If the number is
//negative, raise it to power 2. If the entered number is zero, don’t change it. Display the result on the screen.
public static void main(String[] args){

    Scanner numberScanner = new Scanner(System.in);
    System.out.println("Enter inteager from the keayboard: ");
    int number = numberScanner.nextInt();

    if(number > 0){
        System.out.println(number*2);
    } else if (number < 0) {
        System.out.println(number*number);
    }
       else {
        System.out.println(number);
    }
}
}
