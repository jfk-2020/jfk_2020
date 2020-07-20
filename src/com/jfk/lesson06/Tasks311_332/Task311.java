package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task311 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int x : X) {
            if (x > 0) {
                count++;
            }
            if (max < x) {
                max = x;
            }
        }
        int[] Y = new int[count];
        int j = 0;
        for (int x : X) {
            if (x > 0) {
                Y[j] = x + max;
                j++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
