package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_253 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(elements);

        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
            if (elements[i] < min) {
                min = elements[i];
            }
            sum = max + min;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
}
