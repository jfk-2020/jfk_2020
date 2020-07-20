package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task319 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int max = X[ArrayGenerator.maxIdentifier(X)];
        int[] Y = new int[X.length + X.length / 3];
        int j = 0;
        for (int i = 0; i < X.length; i++) {
            if ((i + 1) % 3 == 0) {
                Y[j] = X[i] + max;
                j++;
                Y[j] = 0;
            } else {
                Y[j] = X[i] + max;
            }
            j++;
        }
        ArrayGenerator.displayArray(Y);
    }
}
