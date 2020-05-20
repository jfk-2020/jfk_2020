package com.jfk.homework05.homework261_290;

public class Task_262 {
    public static void main(String[] args) {

        int sum = 0;
        int sumX = 0;
        int sumY = 0;
        int a = 0;
        int b = 0;
        int countX = 0;
        int countY = 0;

        int[] x = new int[]{3, 5, 7, 15, 23};
        int[] y = new int[]{2, 4, 8, 12, 38};

        for (int i = 0; i < x.length; i++) {
            sumX += x[i] * x[i];
            countX++;
            a = sumX / countX;
        }
        for (int i = 0; i < y.length; i++) {
            sumY += y[i] * y[i];
            countY++;
            b = sumY / countY;
        }
        sum = a + b;
        System.out.println(sum);
    }
}
