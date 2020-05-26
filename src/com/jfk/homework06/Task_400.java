package com.jfk.homework06;

import com.jfk.ArrayElementGenerator;

public class Task_400 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = ArrayElementGenerator.generateAsRandom(n);
        ArrayElementGenerator.displayArray(array);

        int count = 0;
        int[] y = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                y[count++] = array[i];
            }
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.print(y[i] + " ");
        }
    }
}

