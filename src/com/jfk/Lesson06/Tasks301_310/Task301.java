package com.jfk.Lesson06.Tasks301_310;

import com.jfk.Lesson06.ArrayGenerator;

public class Task301 {
    public static void main(String[] args) {
        int k = 9;
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 10; i < 100; i++) {
            if (i % k == 0) {
                array[j] = i;
                j++;
            }
        }
        ArrayGenerator.displayArray(array);
    }
}
