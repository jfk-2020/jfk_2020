package com.jfk.Lesson06.Tasks281_290;

public class Task287 {
    public static void main(String[] args) {
        int n = 10;
        int p = 2;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int ny = 0;
        for (int i = 0; i < X.length; i++){
            if (X[i] != i) {
                ny++;
            }
        }
        int[] Y = new int[ny];
        int j = 0;
        for (int i = 0; i < X.length; i++){
            if (X[i] != i) {
                Y[j] = X[i];
                j++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
