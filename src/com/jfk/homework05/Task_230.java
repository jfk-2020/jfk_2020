package com.jfk.homework05;

public class Task_230 {
    public static void main(String[] args) {
        int k = 3;
        double sum = 0;
        int count = 0;

        double[] array = new double[4];
        array[0] = 3.15;
        array[1] = 9.20;
        array[2] = 7.12;
        array[3] = 2.17;

        for (int i = 0; i < array.length; i++) {
            if (((int)array[i]) % k == 0) {
                sum += array[i] * array[i];
                count++;
            }
        }
        System.out.println(sum / count);

    }
}
