package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_240 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int count = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 7 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
