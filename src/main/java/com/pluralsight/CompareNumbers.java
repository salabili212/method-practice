package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));          // false
        System.out.println(isEven(8));          // true
        System.out.println(isPositive(4.5));    // true
        System.out.println(isPositive(-1));     // false
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }
}