package com.jfk.homework05.homework281_290;

public class Task_286 {
    public static void main(String[] args) {

        int[] x = new int[]{2, 4, -8, 18, 32, -29, 7};

        int count = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                count++;
            }
        }
        int[] y = new int[count];
        int z = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                y[z] = x[i];
                z++;
            }
        }

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }

}
