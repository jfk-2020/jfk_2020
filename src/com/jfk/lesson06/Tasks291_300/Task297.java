package com.jfk.lesson06.Tasks291_300;

import com.jfk.lesson06.ArrayGenerator;

public class Task297 {
    public static void main(String[] args) {
        int n = 10;
        int k = 40;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int x : X) {
            if (!(Math.abs(x) > k)) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int i = 0;
        for (int x : X) {
            if (!(Math.abs(x) > k)) {
                Y[i] = x;
                i++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
