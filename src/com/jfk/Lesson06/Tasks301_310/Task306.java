package com.jfk.Lesson06.Tasks301_310;

import com.jfk.Lesson06.ArrayGenerator;

public class Task306 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int k1 = i/10;
            int k2 = i - k1*10;
            if (k1 + k2 > 5) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 10; i < 100; i++) {
            int k1 = i/10;
            int k2 = i - k1*10;
            if (k1 + k2 > 5) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(count);
        ArrayGenerator.displayArray(array);
    }
}
