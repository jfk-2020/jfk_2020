package com.jfk.homework05.homework261_270;

import com.jfk.ArrayElementGenerator;

public class Task_268 {
    public static void main(String[] args) {
        int k = 3;
        int count = 0;

        int[] elements = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(elements);

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
