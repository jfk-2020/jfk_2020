package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_248 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int k = 3;
        int sum = 0;
        double square = 1;

        for (int i = 0; i < elements.length; i++) {
            square = Math.pow(elements[i] + i, 2);
            if (square % k == 0) {
                sum += elements[i];
            }
        }
        System.out.println(sum);

    }
}
