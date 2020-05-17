package com.jfk.Lesson06.Tasks281_290;

public class Task289 {
    public static void main(String[] args) {
        int n = 10;
        int c = 28;
        int d = 397;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int x : X) {
            if (c <= x*x && x*x <= d) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int i = 0;
        for (int x : X) {
            if (c <= x*x && x*x <= d) {
                Y[i] = x;
                i++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
