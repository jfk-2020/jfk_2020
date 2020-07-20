package com.jfk.lesson06.Tasks281_290;

import com.jfk.lesson06.ArrayGenerator;

public class Task282 {
    public static void main(String[] args) {
        int n = 10;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int x : X) {
            if (x != 0) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int i = 0;
        for (int x : X) {
            if (x != 0) {
                Y[i] = x;
                i++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
