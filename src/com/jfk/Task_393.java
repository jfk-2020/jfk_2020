package com.jfk;

/**
 * @author William Arustamyan
 */

public class Task_393 {


    public static void main(String[] args) {


        int[] array = {1, 2, 2, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 3, 0};

        int maxCount = 0;
        int temporaryCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                temporaryCount++;
            } else {
                System.out.println("temp count : " + temporaryCount);
                if (temporaryCount > maxCount) {
                    maxCount = temporaryCount;
                }
                temporaryCount = 0;
            }
        }
        System.out.println(maxCount);
    }
}
