package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task374 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                continue;
            }
            if (isNumberSimple(Math.abs(x[i]))) {
                count++;
                sum += x[i];
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }

    public static boolean isNumberSimple(int x) {
        for (int i = 2; i < x /2 +1; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
