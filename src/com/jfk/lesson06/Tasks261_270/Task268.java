package com.jfk.lesson06.Tasks261_270;

import com.jfk.lesson06.ArrayGenerator;

public class Task268 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int count = 0;
        int k = 6;
        for (int i = 0; i < X.length; i++){
            if (X[i] % k == 0) {
                count++;
            }
            if (Y[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
