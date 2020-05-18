package com.jfk.Lesson06.Tasks301_310;

import com.jfk.Lesson06.ArrayGenerator;

public class Task303 {
    public static void main(String[] args) {
        int n = 7899;
        int count = 0;
        for (int i = 9; i < Integer.MAX_VALUE; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 9; i < Integer.MAX_VALUE; i++) {
            if (i % n == 0) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(count);
        //ArrayGenerator.displayArray(array);
    }
}
