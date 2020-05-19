package com.jfk.Lesson06.Tasks311_332;

import com.jfk.Lesson06.ArrayGenerator;

public class Task313 {
    public static void main(String[] args) {
        int n = 21;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = new int[n];
        for (int i = 0; i < n / 2; i++) {
            Y[2*i + 1] = X[2*i];
            Y[2*i] = X[2*i + 1];
        }
        if (n % 2 == 1) {
            Y[Y.length - 1] = X[X.length - 1];
        }
        ArrayGenerator.displayArray(Y);
    }
}
