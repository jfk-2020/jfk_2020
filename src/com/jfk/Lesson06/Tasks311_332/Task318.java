package com.jfk.Lesson06.Tasks311_332;

import com.jfk.Lesson06.ArrayGenerator;

public class Task318 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = new int[X.length];
        int j = 0;
        for (int x : X) {
            if (x < 0) {
                Y[j] = x;
                j++;
            }
        }
        for (int x : X) {
            if (x == 0) {
                Y[j] = x;
                j++;
            }
        }
        for (int x : X) {
            if (x > 0) {
                Y[j] = x;
                j++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
