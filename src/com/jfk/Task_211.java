package com.jfk;

public class Task_211 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        int[] a = new int[5];
        a[0] = 9;
        a[1] = -14;
        a[2] = 12;
        a[3] = -54;
        a[4] = 36;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i];
                count += 1;
            }
        }
        System.out.println(sum / count);

    }
}
