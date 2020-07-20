package com.jfk.lesson06.Tasks261_270;

import com.jfk.lesson06.ArrayGenerator;

public class Task262 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int sumx = 0;
        int sumy = 0;
        for (int i = 0; i < X.length; i++){
            sumx += X[i] * X[i];
            sumy += Y[i] * Y[i];
        }
        System.out.println((sumx / n) * (sumy / n));
    }
}
