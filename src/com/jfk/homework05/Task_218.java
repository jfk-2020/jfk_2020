package com.jfk.homework05;

public class Task_218 {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = new int[6];
        a[0] = 1;
        a[1] = -4;
        a[2] = 8;
        a[3] = 9;
        a[4] = -3;
        a[5] = -2;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                sum += Math.abs(a[i]);
            }
        }
        System.out.println(sum);
    }
}
