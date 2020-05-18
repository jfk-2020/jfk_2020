package com.jfk.homework05;

public class Task_225 {
    public static void main(String[] args) {
        int t = 10;
        int product = 1;

        int[] array = new int[]{4, 2, 3, 12};

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < t) {
                product *= array[i];
            }
        }
        System.out.println(product);
    }
}
