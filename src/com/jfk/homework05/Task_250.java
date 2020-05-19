package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_250 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(elements);

        int product = 1;
        int square = 1;

        for (int i = 0; i < elements.length; i++) {
            product = elements[i] * i;
            if (product % 3 == 2) {
                square *= Math.pow(elements[i], 2);
            }
        }
        System.out.println(square);
    }
}
