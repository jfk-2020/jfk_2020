package com.jfk.homework05.homework281_290;

public class Task_290 {
    public static void main(String[] args) {

        int[] x = new int[]{6, 12, -6, 18, 54, -29, -52};

        int count = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 6 == 0) {
                count++;
            }
        }
        int[] y = new int[count];
        int z = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 6 == 0) {
                y[z] = x[i];
                z++;
            }
        }

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}

