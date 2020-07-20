package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task321 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int imax = ArrayGenerator.maxIdentifier(X);
        int max = X[imax];
        int[] Y = new int[imax];
        for (int i = 0; i < imax; i++) {
            Y[i] = X[i] + max;
        }
        ArrayGenerator.displayArray(Y);
    }
}
