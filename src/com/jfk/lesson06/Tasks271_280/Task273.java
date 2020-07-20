package com.jfk.lesson06.Tasks271_280;

import com.jfk.lesson06.ArrayGenerator;

public class Task273 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArray(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 's') {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
