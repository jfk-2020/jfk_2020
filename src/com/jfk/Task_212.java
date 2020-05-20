package com.jfk;

public class Task_212 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        int[] a = new int[5];
        a[0] = 8;
        a[1] = -20;
        a[2] = 45;
        a[3] = 15;
        a[4] = 6;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i] * a[i];
                count += 1;
            }
        }
        System.out.println(sum / count);
    }
}
