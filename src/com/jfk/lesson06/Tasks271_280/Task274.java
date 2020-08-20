package com.jfk.lesson06.Tasks271_280;

import com.jfk.lesson06.ArrayGenerator;

public class Task274 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArray(array);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 'h') {
                sum += i;
                count++;
            }
        }
        if (count == 0 ) {
            System.out.println(0);
        } else {
            System.out.println(sum / count);
        }
    }
}