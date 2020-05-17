package com.jfk.Lesson06.Tasks261_270;

import com.jfk.Lesson06.ArrayGenerator;

public class Task266 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int sumx = 0;
        int sumy = 0;
        for (int i = 0; i < X.length; i++){
            if (X[i] % 2 == 1) {
                sumx += X[i];
            }
            if (Y[i] % 2 == 0) {
                sumy += Y[i];
            }
        }
        System.out.println(sumx);
        System.out.println(sumy);
        System.out.println(sumx - sumy);
    }
}
