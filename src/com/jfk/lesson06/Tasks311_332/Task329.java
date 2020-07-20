package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task329 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = new int[X.length];
        for(int i = 0; i < X.length; i++){
            Y[i] = X[i];
            for (int j = 0; j < i; j++) {
                Y[i] += X[j];
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
