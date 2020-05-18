package com.jfk.Lesson06.Tasks301_310;

import com.jfk.Lesson06.ArrayGenerator;

public class Task302 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if (i % 5 == 2) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 100; i < 1000; i++) {
            if (i % 5 == 2) {
                array[j] = i;
                j++;
            }
        }
        ArrayGenerator.displayArray(array);
    }
}
