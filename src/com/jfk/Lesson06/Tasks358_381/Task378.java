package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task378 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        boolean isFollow = true;
        for (int i = 0; i < x.length - 1; i++) {
            if ((x[i] > 0 && x[i + 1] > 0) || (x[i] < 0 && x[i + 1] < 0)) {
                isFollow = false;
                break;
            }
        }
        if (isFollow) {
            int sum = 0;
            for (int i = 0; i < x.length; i++) {
                if (i % 2 == 0) {
                    sum += x[i];
                }
            }
            System.out.println(sum);
        } else {
            int sum = 1;
            for (int i = 0; i < x.length; i++) {
                if (i % 2 == 1) {
                    sum *= x[i];
                }
            }
            System.out.println(sum);
        }
    }
}
