package com.jfk;

public class Task_213 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        int[] a = new int[7];
        a[0] = 13;
        a[1] = 44;
        a[3] = 54;
        a[4] = 3;
        a[5] = -41;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sum += a[i] * a[i];
                count += 1;
            }

        }
        System.out.println(sum / count);
    }
}
