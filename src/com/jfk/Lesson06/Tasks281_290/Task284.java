package com.jfk.Lesson06.Tasks281_290;

public class Task284 {
    public static void main(String[] args) {
        int n = 10;
        int a = -93;
        int b = 27;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int x : X) {
            if (a <= x && x <= b) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int i = 0;
        for (int x : X) {
            if (a <= x && x <= b) {
                Y[i] = x;
                i++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
