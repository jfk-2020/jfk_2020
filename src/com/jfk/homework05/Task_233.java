package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_233 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        int sum = 0;
        int product = 1;
        int count = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                sum += elements[i];
                product *= elements[i];
            }
        }
        System.out.println(sum);
        System.out.println(product);

    }
}
