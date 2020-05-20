package com.jfk.homework05.homework281_290;

public class Task_289 {
    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 4, 7, 9, 16, 49, 83, 4};
        int count = 0;
        int c = 1;
        int d = 7;

        for (int i = 0; i < x.length; i++) {
            double square = Math.pow(x[i], 2);
            if (square >= c && square <= d) {
                count++;
            }
        }
        int[] y = new int[count];
        int z = 0;

        for (int i = 0; i < x.length; i++) {
            double square = Math.pow(x[i], 2);
            if (square >= c && square <= d) {
                y[z] = x[i];
                z++;
            }
        }

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
