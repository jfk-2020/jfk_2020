package com.jfk.homework05;

public class Task_219 {
    public static void main(String[] args) {
        int count = 0;
        int k = 3;

        int[] a = new int[5];
        a[0] = 3;
        a[1] = 15;
        a[2] = 9;
        a[3] = 12;
        a[4] = 30;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
