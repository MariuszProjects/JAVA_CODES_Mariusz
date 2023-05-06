package org.example;
import java.util.Scanner;

public class TaxCalculation {
    // The program calculates the tax value. The free tax value is 1000 PLN, When the salary is below 50.000 PLN the tax is 20%,
    // for the salary equal or more than 50.000 PLN the tax is 35%
        public static void main (String[] args){
            Scanner inputSalary = new Scanner(System.in);
            System.out.println("Please enter your yearly salary in PLN: ");
            double salary = inputSalary.nextDouble();
            int taxFreeValue = 1000;

            if (salary <=taxFreeValue){
                System.out.println("The yearly tax is 0 PLN");
            }
            else if (salary < 50000){
                System.out.println("The yearly tax is: " + (salary - taxFreeValue) * 0.2 + " PLN");
            }
            else {
                System.out.println("The yearly tax is: " + (salary - taxFreeValue) * 0.35 + " PLN");
            }
    }
}
