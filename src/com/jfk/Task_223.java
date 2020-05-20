package com.jfk;

public class Task_223 {
    public static void main(String[] args) {
        int count = 0;
        int a = 0;
        int b = 8;

        int[] array = new int[]{1, 4, 6, 10, 14};

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
