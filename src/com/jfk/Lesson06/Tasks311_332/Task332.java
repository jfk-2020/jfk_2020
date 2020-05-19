package com.jfk.Lesson06.Tasks311_332;

import com.jfk.Lesson06.ArrayGenerator;

public class Task332 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int max = X[ArrayGenerator.maxIdentifier(X)];
        int min = X[ArrayGenerator.minIdentifier(X)];
        int[] Y = new int[X.length];
        for(int i = 0; i < X.length; i++){
            if (X[i] == max) {
                Y[i] = min * min;
            } else if (X[i] == min) {
                Y[i] = max * max * max;
            } else {
                Y[i] = X[i];
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
