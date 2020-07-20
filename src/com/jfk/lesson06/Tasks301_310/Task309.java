package com.jfk.lesson06.Tasks301_310;

import com.jfk.lesson06.ArrayGenerator;

public class Task309 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 3 != 0 && i % 2 != 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 3 != 0 && i % 2 != 0) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(count);
        ArrayGenerator.displayArray(array);
    }
}
