package org.example;

public class ArrayDescendingOrder {
//Implement a method that will take an array of integers as a parameter and will return it sorted descending.
    public static void main(String[] args) {
        int[] intArray = new int[]{54, 65, 87, 25, 99};
        System.out.println("An array before sorting looks like this: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        int t;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {
                    t = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = t;
                }
            }
        }
        System.out.println("Sorted descending array looks this way: ");
        for (int a : intArray) {
            System.out.println(a);
        }
    }
}
