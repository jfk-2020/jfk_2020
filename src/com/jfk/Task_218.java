package com.jfk;

public class Task_218 {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = new int[6];
        a[0] = 3;
        a[1] = 13;
        a[2] = 4;
        a[3] = 7;
        a[4] = -12;
        a[5] = 6;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                sum += Math.abs(a[i]);
            }
        }
        System.out.println(sum);
    }
}
