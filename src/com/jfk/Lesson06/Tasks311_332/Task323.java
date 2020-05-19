package com.jfk.Lesson06.Tasks311_332;

import com.jfk.Lesson06.ArrayGenerator;

public class Task323 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int b = (X[ArrayGenerator.minIdentifier(X)] + X[ArrayGenerator.maxIdentifier(X)]) / 2;
        int count = 0;
        for (int x : X) {
            if (x > b) {
                count++;
            }
        }
        int[] Y = new int[count];
        int j = 0;
        for (int x : X) {
            if (x > b) {
                Y[j] = x;
                j++;
            }
        }
        System.out.println(b);
        ArrayGenerator.displayArray(Y);
    }
}
