package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task411 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int count = 0;
        boolean isGrow = false;
        for (int i = 1; i < x.length; i++) {
            if (!(x[i] < x[i - 1])) {
                isGrow = true;
            } else if (isGrow) {
                count++;
                isGrow = false;
            }
        }
        System.out.println(count);
    }

}
