package com.jfk;

public class Task_216 {
    public static void main(String[] args) {

        int product = 1;
        int[] a = new int[5];
        a[0] = 18;
        a[1] = 17;
        a[2] = 13;
        a[3] = 4;
        a[4] = 15;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                product *= a[i];
            }
        }
        System.out.println(product);
    }
}
