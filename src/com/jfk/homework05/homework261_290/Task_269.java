package com.jfk.homework05.homework261_290;

public class Task_269 {
    public static void main(String[] args) {
        int sumX = 0;
        int sumY = 0;
        int sum = 0;

        int[] x = new int[]{2, 5, 8, 22, 17};
        int[] y = new int[]{1, 7, 17, 28, 34};

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                sumX += x[i];
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i] % 2 != 0) {
                sumY = x[i];
            }
        }
        sum = sumX + sumY;
        System.out.println(sum);
    }
}

