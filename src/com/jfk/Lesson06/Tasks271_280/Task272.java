package com.jfk.Lesson06.Tasks271_280;

import com.jfk.Lesson06.ArrayGenerator;

public class Task272 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArray(array);
        int count = 0;
        boolean t = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'b') {
                count++;
            }
        }
        t = (count >= n/2);
        System.out.println(t);
    }
}
