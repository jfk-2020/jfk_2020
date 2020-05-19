package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_255 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int max = 0;
        int sum = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
                sum = i + max;
            }
        }
        System.out.println(sum);
    }
}