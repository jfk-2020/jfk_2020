package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task325 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int max = X[ArrayGenerator.maxIdentifier(X)];
        int x0 = X[0];
        int[] Y = new int[X.length];
        for (int i = 0; i < Y.length; i++) {
            Y[i] = X[i];
            if (i == 0) {
                Y[i] += max;
            } else if (Y[i] == max) {
                Y[i] += x0;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
