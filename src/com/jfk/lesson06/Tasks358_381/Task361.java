package com.jfk.lesson06.Tasks358_381;

import com.jfk.lesson06.ArrayGenerator;

public class Task361 {
    public static void main(String[] args) {
        int m = 20;
        int[] x = ArrayGenerator.generateAsRandom(m);
        ArrayGenerator.displayArray(x);
        int sum = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] % 7 != 0 && x[i] % 5 == 0) {
                sum += x[i];
            }
        }
        System.out.println(sum);
    }
}
