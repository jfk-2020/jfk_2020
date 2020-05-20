package com.jfk.homework05.homework281_290;

public class Task_284 {
    public static void main(String[] args) {

        int a = 1;
        int b = 4;
        int[] x = new int[]{2, 4, -8, 18, 32, -29, -52};

        if (a < 0 || a > b) {
            a = 0;
        }
        if (b < a || b > x.length) {
            b = 0;
        }

        int[] y = new int[b - a];
        int z = 0;

        for (int i = a; i < b; i++) {
            y[z] = x[i];
            z++;
        }

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
