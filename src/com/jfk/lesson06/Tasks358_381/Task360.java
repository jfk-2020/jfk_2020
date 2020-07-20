package com.jfk.lesson06.Tasks358_381;

import com.jfk.lesson06.ArrayGenerator;

public class Task360 {
    public static void main(String[] args) {
        int n = 20;
        int[] a = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(a);
        int sum = 0;
        for (int k = 1; k < a.length; k++) {
            if (a[k] % 7 == 1 || a[k] %7 == 2 || a[k] % 7 == 5) {
                sum += a[k];
            }
        }
        System.out.println(sum);
    }
}
