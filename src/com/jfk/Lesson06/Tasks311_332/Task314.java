package com.jfk.Lesson06.Tasks311_332;

import com.jfk.Lesson06.ArrayGenerator;

public class Task314 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int count = 0;
        for (int x : X) {
            if (x > 0) {
                count++;
            }
        }
        int[] Y = new int[count*2];
        int j = 0;
        for (int x : X) {
            if (x > 0) {
                Y[j] = x;
                j++;
                Y[j] = 0;
                j++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
