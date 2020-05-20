package com.jfk.homework05.homework261_270;

public class Task_267 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 9, 49, 7, 74, 7};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
