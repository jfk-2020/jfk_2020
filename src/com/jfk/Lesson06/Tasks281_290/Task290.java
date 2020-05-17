package com.jfk.Lesson06.Tasks281_290;

public class Task290 {
    public static void main(String[] args) {
        int n = 10;
        int p = 6;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int x : X) {
            if (Math.abs(x) % p == 1) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int i = 0;
        for (int x : X) {
            if (Math.abs(x) % p == 1) {
                Y[i] = x;
                i++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
