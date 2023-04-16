package org.example;

public class LoopExample1 {
//In the print method, display the passed string 5 times.

    public static void main(String[] args) {
        print("I want to learn Java! " +
        "Being an automation engineer is nice!");
    }
    public static void print(String s) {
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
        }
    }
}

