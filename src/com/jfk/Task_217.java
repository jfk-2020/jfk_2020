package com.jfk;

public class Task_217 {
    public static void main(String[] args) {
        int product = 1;
        int[] a = new int[5];
        a[0] = 7;
        a[1] = 2;
        a[2] = 9;
        a[3] = 8;
        a[4] = 74;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                product *= a[i] * a[i];
            }
        }
        System.out.println(product);
    }
}
