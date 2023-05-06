package org.example;

public class FizzBuzz {
    public static void main(String[] args) {
      for (int number = 1; number <= 100; number++) {
            if (number % 15 == 0) {
                System.out.println("FizzBuzz - the integer can be divided by 3 & 5");
                continue;
            }
            if (number % 3 == 0) {
                System.out.println("Fizz - the integer can be divided by 3");
                continue;
            }
            if (number % 5 == 0) {
                System.out.println("Buzz - the integer can be divided by 5");
            } else System.out.println(number);
        }
    }
}


