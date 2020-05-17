package com.jfk.Lesson06.Tasks271_280;

import com.jfk.Lesson06.ArrayGenerator;

public class Task278 {
    public static void main(String[] args) {
        int n = 20;
        char[] array = ArrayGenerator.generateAsRandomChar(n);
        ArrayGenerator.displayArrayChar(array);
        int count = 0;
        if (n % 2 == 0) {
            count = n/ 2;
        } else {
            count = n / 2 + 1;
        }
        char[] newArray = new char[count];
        for (int i = 0; i < count; i++){
            newArray[i] = array[2*i + 1];
        }
        ArrayGenerator.displayArrayChar(newArray);
    }
}
