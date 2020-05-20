package com.jfk;

public class Task_220 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;

        int[] a = new int[6];
        a[0] = -6;
        a[1] = -22;
        a[2] = -16;
        a[3] = 5;
        a[4] = 4;
        a[5] = 10;

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
