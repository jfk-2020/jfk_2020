package com.jfk.homework06;

import com.jfk.ArrayElementGenerator;

public class Task_392 {
    public static void main(String[] args) {
        int[] array = ArrayElementGenerator.generateAsRandom(10);
        System.out.print("Original array numbers: ");
        ArrayElementGenerator.displayArray(array);

        for(int i = 0; i < array.length/2; i++){

            //add tmp variable to find the corresponding index
            int tmp = array[array.length - i -1];
            //swipe numbers
            array[array.length-i-1] = array[i];
            array[i] = tmp;
        }
        System.out.print("Swiped array numbers: ");
        ArrayElementGenerator.displayArray(array);
    }
}