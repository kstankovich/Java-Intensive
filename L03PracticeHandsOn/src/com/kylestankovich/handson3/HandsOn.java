package com.kylestankovich.handson3;

public class HandsOn {

    public static void main(String[] args) {
        // define array with 5 values
        int[] values = {0, 0, 0, 0, 0};

        // collect 5 integer inputs
        for(int i = 0; i < values.length; i++) {
            System.out.println("Enter a number: ");
            values[i] = StudentHelper.ReadInputInt();
        }

        // print array contents
        System.out.println("Array Contents:");
        for(int val: values) {
            System.out.println(val);
        }

        // print array contents in reverse order
        System.out.println("Array Contents in Reverse");
        for(int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }

        // print array contents where index is odd
        System.out.println("Array Contents at Odd Indices");
        for(int i = 0; i < values.length; i++) {
            if(i % 2 != 0) {
                System.out.println("Value at odd index " + i + ": " + values[i]);
            }
        }
    }
}