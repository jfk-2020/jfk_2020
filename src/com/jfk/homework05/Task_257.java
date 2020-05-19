package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_257 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int max =elements[0];
        int index = 0;

        for(int i = 0; i < elements.length; i++){
            if (elements[i] > max){
                max = elements[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
