package com.jfk.Lesson06.Tasks311_332;

import com.jfk.Lesson06.ArrayGenerator;

public class Task315 {
    public static void main(String[] args) {
        int n = 20;
        int b = 6;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int countPositive = 0;
        int countNegative = 0;
        int min = Integer.MAX_VALUE;
        for (int x : X) {
            if (x > 0) {
                countPositive++;
            } else if (x < 0) {
                countNegative++;
            }
            if (min > x) {
                min = x;
            }
        }
        int count = 0;
        if (min < b) {
            count = countPositive;
        } else {
            count = countNegative;
        }
        int[] Y = new int[count];
        int j = 0;
        for (int x : X) {
            if (min < b) {
                if (x > 0) {
                    Y[j] = x;
                    j++;
                }
            } else {
                if (x < 0) {
                    Y[j] = x;
                    j++;
                }
            }
        }
        System.out.println(min);
        System.out.println(b);
        ArrayGenerator.displayArray(Y);
    }
}
