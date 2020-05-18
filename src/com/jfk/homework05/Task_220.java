package com.jfk.homework05;

public class Task_220 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;

        int[] a = new int[6];
        a[0] = 3;
        a[1] = 2;
        a[2] = 5;
        a[3] = -4;
        a[4] = -7;
        a[5] = 7;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positive++;
            } else if (a[i] < 0) {
                negative++;
            }
        }
        System.out.println("Positive numbers are: " + positive + " " + "Negative numbers are: "  + negative);
    }
}
