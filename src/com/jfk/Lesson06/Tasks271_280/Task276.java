package com.jfk.Lesson06.Tasks271_280;

import com.jfk.Lesson06.ArrayGenerator;

public class Task276 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArray(array);
        boolean t = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'r') {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}
