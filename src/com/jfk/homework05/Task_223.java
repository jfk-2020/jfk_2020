package com.jfk.homework05;

public class Task_223 {
    public static void main(String[] args) {
        int count = 0;
        int a = 0;
        int b = 3;

        int[] array = new int[5];
        array[0] = 2;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        if (a < 0 || a > array.length) {
            a = 0;
        }

        if (b <= a || b > array.length) {
            b = array.length;
        }

        for (int i = a; i < b; i++) {
            count++;
        }
        System.out.println(count);
    }
}

