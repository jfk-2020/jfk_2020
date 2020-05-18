package com.jfk.homework05;

public class Task_229 {
    public static void main(String[] args) {
        int product = 1;

        int[] array = new int[5];
        array[0] = 3;
        array[1] = 10;
        array[2] = 1;
        array[3] = 35;

        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                product *= array[i];
            }
        }
        System.out.println(product);
    }

}
