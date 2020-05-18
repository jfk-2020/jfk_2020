package com.jfk.homework05;

public class Task_212 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        int[] a = new int[5];
        a[0] = 7;
        a[1] = -10;
        a[2] = 2;
        a[3] = -30;
        a[4] = 4;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i] * a[i];
                count += 1;
            }
        }
        System.out.println(sum / count);
    }
}

