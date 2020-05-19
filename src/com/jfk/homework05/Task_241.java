package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_241 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int sum = 0;
        int k = 3;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % k == 0) {
                sum += elements[i];
            }
        }
        System.out.println(sum);
    }
}
