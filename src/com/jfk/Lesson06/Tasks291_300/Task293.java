package com.jfk.Lesson06.Tasks291_300;

import com.jfk.Lesson06.ArrayGenerator;

public class Task293 {
    public static void main(String[] args) {
        int n = 10;
        int a = -15;
        int b = 89;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int x : X) {
            if (!(a <= x && x <= b)) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int i = 0;
        for (int x : X) {
            if (!(a <= x && x <= b)) {
                Y[i] = x;
                i++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
