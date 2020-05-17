package com.jfk.Lesson06.Tasks271_280;

import com.jfk.Lesson06.ArrayGenerator;

public class Task275 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArrayChar(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 'k') {
                count++;
            }
        }
        System.out.println(count);
    }
}
