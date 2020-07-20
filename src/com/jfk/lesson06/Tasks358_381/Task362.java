package com.jfk.lesson06.Tasks358_381;

import com.jfk.lesson06.ArrayGenerator;

public class Task362 {
    public static void main(String[] args) {
        int m = 100;
        int[] x = ArrayGenerator.generateAsRandom(m);
        ArrayGenerator.displayArray(x);
        int b = 55;
        int sum = 0;
        for (int i = 1; i < x.length; i *= 2) {
            if (x[i] < b) {
                sum += x[i];
            }
        }
        System.out.println(sum);
    }
}
