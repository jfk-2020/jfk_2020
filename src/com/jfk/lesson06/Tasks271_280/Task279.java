package com.jfk.lesson06.Tasks271_280;

import com.jfk.lesson06.ArrayGenerator;

public class Task279 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArray(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 'k') {
                count++;
            }
        }
        char[] newArray = new char[count];
        int i = 0;
        for (char c : array) {
            if (c > 'k') {
                newArray[i] = c;
                i++;
            }
        }
        ArrayGenerator.displayArray(newArray);
    }
}
