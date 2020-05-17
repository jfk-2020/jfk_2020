package com.jfk.Lesson06.Tasks291_300;

import com.jfk.Lesson06.Tasks281_290.ArrayGenerator;

public class Task294 {
    public static void main(String[] args) {
        int n = 10;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = X.length / 2;
        int[] Y = new int[ny];
        for (int i = 0; i < ny; i++) {
            Y[i] = X[2*i];
        }
        ArrayGenerator.displayArray(Y);
    }
}
