package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_242 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int product = 1;
        int m = 3;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % m == 0) {
                product *= elements[i];
            }
        }
        System.out.println(product);
    }
}
