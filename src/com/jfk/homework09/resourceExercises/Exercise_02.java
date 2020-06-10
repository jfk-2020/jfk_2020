package com.jfk.homework09.resourceExercises;

public class Exercise_02 {
    //Function for sum of the numbers
    public static int sumOfNumbers(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + sumOfNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNumbers(n));
    }
}
