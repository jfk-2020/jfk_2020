package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task372 {
    public static void main(String[] args) {
        int n = 50;
        int[] a = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(a);
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            int D = a[i] * a[i] - 4*5;
            if (D >= 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
