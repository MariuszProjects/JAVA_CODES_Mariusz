package org.example;
import java.util.Scanner;

public class BeerCostCalculator {
//Calculate the total cost of beer.
    public static void main(String[] args) {
        double beerPriceInput;
        double sumBeerPrice=0;

        do {
            Scanner beerPriceToAdd = new Scanner(System.in);
            System.out.println("Please enter the beer price to add in 'PLN'. When you finish press '0'");
            beerPriceInput = beerPriceToAdd.nextDouble();
            sumBeerPrice+=beerPriceInput;
            }
        while (beerPriceInput!=0);
        System.out.println("The cost of beer is " + sumBeerPrice + " PLN ");
    }
}
