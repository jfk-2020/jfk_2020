package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task377 {
    public static void main(String[] args) {
        int n = 10;
        int[] x = ArrayGenerator.generateAsRandom(n);
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                y[i] = x[i] * x[i];
            } else {
                y[i] = x[i];
            }
        }
        boolean isGrowing = true;
        for (int i = 0; i < y.length - 1; i++) {
            if (y[i] >= y[i + 1]) {
                isGrowing = false;
                break;
            }
        }
        if (isGrowing) {
            int sum = 0;
            for (int i = 0; i < x.length; i++) {
                if (x[i] > 0) {
                    sum += x[i];
                }
            }
            System.out.println(sum);
        } else {
            int sum = 1;
            for (int i = 0; i < x.length; i++) {
                if (x[i] < 0) {
                    sum *= x[i];
                }
            }
            System.out.println(sum);
        }
    }
}
