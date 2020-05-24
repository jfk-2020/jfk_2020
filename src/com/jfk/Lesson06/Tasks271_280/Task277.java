package com.jfk.Lesson06.Tasks271_280;

import com.jfk.Lesson06.ArrayGenerator;

public class Task277 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArray(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 'd') {
                count++;
            }
        }
        char[] newArray = new char[count];
        int i = 0;
        for (char c : array) {
            if (c != 'c') {
                newArray[i] = c;
                i++;
            }
        }
        ArrayGenerator.displayArray(newArray);
    }
}
