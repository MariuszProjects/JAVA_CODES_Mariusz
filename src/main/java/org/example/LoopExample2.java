package org.example;
import java.util.Scanner;
public class LoopExample2 {

//Use the keyboard to enter two digits: a and b. Using for loop display a x b size rectangle made of 0’s.
//Input: a = 5, b = 7
//Output:
//      0000000
//      0000000
//      0000000
//      0000000
//      0000000

    public static void main(String[] args) {
        Scanner numberOfDigits = new Scanner(System.in);
        System.out.println("Please enter the number of rows to print 0's: ");
        int a = numberOfDigits.nextInt();
        System.out.println("Please enter the number of columns to print 0's: ");
        int b = numberOfDigits.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < b; j++) {
                System.out.print("0");
            }
            System.out.println("0");
        }
    }
}
