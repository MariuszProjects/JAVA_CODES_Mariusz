package org.example;
import java.util.Scanner;

public class ExchangeRateMethod {

//Write code for the convertUsdToPln method, which converts dollars to polish zlotys at a given exchange rate.
//Use a return statement to return the result from the method. In the main method call the method 3 times and display results.
    public static double convertUsdToPln(double usdValue, double exchangeRate) {
        return usdValue * exchangeRate;
    }
    public static void main(String[] args) {

        Scanner currencyConvert = new Scanner(System.in);
        System.out.println("Please provide the exchange rate Usd to Pln");
        double exchangeRate = currencyConvert.nextDouble();
        System.out.println("Please enter the value of Usd to be converted into Pln");
        double usdValue = currencyConvert.nextDouble();

        System.out.println("Conversion of Usd to Pln works this way:");

        for(int i = 1 ; i <=3; i+=1){
            System.out.println(usdValue + "$ is " + convertUsdToPln(usdValue,exchangeRate) + "PLN");
    }
}
}

