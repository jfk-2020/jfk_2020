package com.jfk.homework05;

public class Task_216 {
    public static void main(String[] args) {
        int product = 1;
        int[] a = new int[4];
        a[0] = 3;
        a[1] = 2;
        a[2] = 9;
        a[3] = 8;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                product *= a[i];
            }
        }
        System.out.println(product);
    }
}
