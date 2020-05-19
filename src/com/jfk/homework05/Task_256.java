package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_256 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int min = 0;
        int sum = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
                sum = i + min;
            }
        }
        System.out.println(sum);
    }
}
