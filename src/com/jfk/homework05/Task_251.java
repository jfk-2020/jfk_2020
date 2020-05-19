package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_251 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(elements);

        int max = 0;
        for(int i = 0; i < elements.length; i++){
            if(elements[i] > max){
                max = elements[i];
            }
        }
        System.out.println(max);
    }
}
