package org.example;

public class FindMinimumFunction {
//Write a function that computes the minimum of 4 numbers.
//Use the following code. The function minimum(a, b, c, d) should use the function min(a, b).

    public static void main(String[] args) throws Exception {
        System.out.println(min(-10, -5));
        System.out.println(min(-10, -5, -50, -90));
        System.out.println(min(-20, -10, -30, 90));
        System.out.println(min(-80, -1, -75, 40));
    }
    public static int min(int a, int b, int c, int d) {
        return Math.min(min(a,b), min(c,d));
    }
    public static int min(int a, int b) {
        return Math.min(a,b);
    }
}


