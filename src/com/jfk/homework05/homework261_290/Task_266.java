package com.jfk.homework05.homework261_290;

public class Task_266 {
    public static void main(String[] args) {
        int[] x = new int[]{1, 4, 6, 7, 9, 8, 10};
        int[] y = new int[]{2, 3, 5, 12, 22, 7};

        int sum1 = 0;
        int sum2 = 0;
        int sub = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                sum1 += x[i];
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i] % 2 == 0) {
                sum2 += y[i];
            }
        }
        sub = sum1 - sum2;
        System.out.println(sub);
    }
}

