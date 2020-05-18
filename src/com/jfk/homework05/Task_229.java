package com.jfk.homework05;

public class Task_229 {
    public static void main(String[] args) {
        int product = 1;

        int[] array = new int[]{3, 10, 1, 35};

        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                product *= array[i];
            }
        }
        System.out.println(product);
    }

}
