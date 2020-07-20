package com.jfk.lesson06.Tasks261_270;

import com.jfk.lesson06.ArrayGenerator;

public class Task270 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int sum = 0;
        for (int i = 0; i < X.length; i++){
            sum += X[i] * X[i];
            sum += Y[i] * Y[i];
        }
        System.out.println(sum);
    }
}
