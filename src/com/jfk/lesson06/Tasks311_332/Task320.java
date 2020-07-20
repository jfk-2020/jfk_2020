package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task320 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int imax = ArrayGenerator.maxIdentifier(X);
        int min = X[ArrayGenerator.minIdentifier(X)];
        int imin = ArrayGenerator.minIdentifier(X);
        for (int i = X.length - 1; i >= 0; i--) {
            if (min == X[i]) {
                imin = i;
                break;
            }
        }
        int[] Y = new int[X.length- 2];
        int j = 0;
        for (int i = 0; i < X.length; i++) {
            if (i == imax || i == imin) {
                continue;
            }
            Y[j] = X[i];
            j++;
        }
        ArrayGenerator.displayArray(Y);
    }
}
