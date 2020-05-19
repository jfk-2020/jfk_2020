package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_235 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 != 0) {
                sum += elements[i] * elements[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
