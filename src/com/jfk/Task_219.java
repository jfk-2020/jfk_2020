package com.jfk;

public class Task_219 {
    public static void main(String[] args) {
        int count = 0;
        int k = 4;

        int[] a = new int[5];
        a[0] = 8;
        a[1] = 3;
        a[2] = 6;
        a[3] = 20;
        a[4] = 5;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
