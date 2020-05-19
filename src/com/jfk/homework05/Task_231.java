package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_231 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(4);
        ArrayElementGenerator.displayArray(elements);

        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                sum += elements[i] * elements[i];
            }
        }
        System.out.println(sum);
    }
}
