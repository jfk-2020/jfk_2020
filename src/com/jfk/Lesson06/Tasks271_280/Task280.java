package com.jfk.Lesson06.Tasks271_280;

import com.jfk.Lesson06.ArrayGenerator;

public class Task280 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArrayChar(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'f') {
                count++;
            }
        }
        count += n;
        char[] newArray = new char[count];
        int i = 0;
        for (char c : array) {
            newArray[i] = c;
            i++;
            if (c == 'f') {
                newArray[i] = c;
                i++;
            }

        }
        ArrayGenerator.displayArrayChar(newArray);
    }
}
