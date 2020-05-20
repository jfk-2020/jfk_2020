package com.jfk.homework05.homework281_290;

public class Task_285 {
    public static void main(String[] args) {
        int p = 3;
        int count = 0;

        int[] x = new int[]{3, 9, 12, 81, 34, 97};

        for (int i = 0; i < x.length; i++) {
            if (x[i] % p == 0) {
                count++;
            }
        }
        int[] y = new int[count];
        int z = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % p == 0) {
                y[z] = x[i];
                z++;
            }
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
