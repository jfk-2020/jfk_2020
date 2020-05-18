package com.jfk.homework05;

public class Task_230 {
    public static void main(String[] args) {
        int k = 3;
        double sum = 0;
        int count = 0;

        double[] array = new double[]{3.15, 9.20, 7.12, 2.17};

        for (int i = 0; i < array.length; i++) {
            if (((int)array[i]) % k == 0) {
                sum += array[i] * array[i];
                count++;
            }
        }
        System.out.println(sum / count);

    }
}
