package com.jfk.homework05.homework281_290;

public class Task_288 {
    public static void main(String[] args) {
        int count = 0;
        int[] x = new int[]{1, 30, 25, 17, 8, 9, 2, 7};

        for (int i = 0; i < x.length; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        int z = 0;
        int[] y = new int[count];
        for (int i = 0; i < x.length; i++) {
            if (i % 2 != 0) {
                y[z] = x[i];
                z++;
            }
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
