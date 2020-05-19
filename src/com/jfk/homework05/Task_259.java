package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_259 {
    public static void main(String[] args) {
        int[] elements = new int[]{15, 10, 5, 15, 5};

        int min = elements[0];
        int index = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
