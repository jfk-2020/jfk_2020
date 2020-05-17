package com.jfk.Lesson06.Tasks281_290;

public class Task283 {
    public static void main(String[] args) {
        int n = 10;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int x : X) {
            if (Math.abs(x) % 2 == 1) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int i = 0;
        for (int x : X) {
            if (Math.abs(x) % 2 == 1) {
                Y[i] = x;
                i++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
