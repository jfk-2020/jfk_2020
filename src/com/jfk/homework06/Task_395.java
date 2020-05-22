package com.jfk.homework06;

import com.jfk.ArrayElementGenerator;

public class Task_395 {
    public static void main(String[] args) {
        int[] array = new int[]{-17, 27, -30, 25, 13};

        boolean n = false;
        for (int i = 0; i < array.length; i++) {
            //check if the number is positive
            if (array[i] > 0) {
                n = true;
            }
            //if the positive number is already found and check if the array length has come to the end, then swap numbers.
            if (n && i + 1 < array.length) {
                array[i] = array[i + 1];
            }
        }
        //array.length-1 means that go through all the elements besides the last one
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
