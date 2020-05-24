package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task401 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        int k1 = -1;
        int k2 = -1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                if (k1 == -1) {
                    k1 = i;
                } else {
                    k2 = i;
                }
            }
        }
        if (k1 == -1 || k2 == -1) {
            System.out.println(0);
        } else {
            int sum = 1;
            for (int i = k1 + 1; i < k2; i++) {
                sum *= x[i];
            }
            System.out.println(sum);
        }
    }
}
