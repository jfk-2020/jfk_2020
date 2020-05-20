package com.jfk;

public class Task_230 {
    public static void main(String[] args) {
        int k = 5;
        double sum = 0;
        int count = 0;

        double[] array = new double[]{5.30, 1.20, 10.30, 3.13};

        for (int i = 0; i < array.length; i++) {
            if (((int)array[i]) % k == 0) {
                sum += array[i] * array[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
