package com.jfk.Lesson06.Tasks291_300;

import com.jfk.Lesson06.ArrayGenerator;

public class Task295 {
    public static void main(String[] args) {
        int n = 10;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        if (X.length % 2 == 0) {
            ny = X.length / 2;
        }else {
            ny = X.length / 2 + 1;
        }
        int[] Y = new int[ny];
        for (int i = 0; i < ny; i++) {
            Y[i] = X[2*i + 1];
        }
        ArrayGenerator.displayArray(Y);
    }
}
