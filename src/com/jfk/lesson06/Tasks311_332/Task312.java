package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task312 {
    public static void main(String[] args) {
        int n = 21;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int count = 0;
        if (n % 2 == 0) {
            count = n / 2;
        } else {
            count = n / 2 + 1;
        }
        int[] Y = new int[count];
        for (int i = 0; i < n / 2; i++) {
            if (Math.abs(X[2*i]) > Math.abs(X[2*i + 1])) {
                Y[i] = X[2*i];
            } else {
                Y[i] = X[2*i + 1];
            }
        }
        if (n % 2 == 1) {
            Y[Y.length - 1] = X[X.length - 1];
        }
        ArrayGenerator.displayArray(Y);
    }
}
