package com.jfk.Lesson06.Tasks261_270;

import com.jfk.Lesson06.ArrayGenerator;

public class Task267 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int sum = 0;
        for (int i = 0; i < X.length; i++){
            if (X[i] % 7 == 0) {
                sum += X[i];
            }
            if (Y[i] % 7 == 0) {
                sum += Y[i];
            }
        }
        System.out.println(sum);
    }
}
