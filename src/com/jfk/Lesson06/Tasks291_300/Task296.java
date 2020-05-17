package com.jfk.Lesson06.Tasks291_300;

import com.jfk.Lesson06.ArrayGenerator;

public class Task296 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int x : X) {
            if (!(x % k == 2)) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int i = 0;
        for (int x : X) {
            if (!(x % k == 2)) {
                Y[i] = x;
                i++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
