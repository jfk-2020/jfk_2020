package com.jfk.homework06;

import com.jfk.ArrayElementGenerator;

import java.util.Arrays;

public class Task_397 {
    public static void main(String[] args) {

        int[] x = new int[]{3, 7, 17, 23};
        int[] y = new int[]{5, 6, 8, 25};

        int[] z = new int[x.length + y.length];

        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
        }
        int k = x.length;

        for (int i = 0; i < y.length; i++,k++) {
            z[k] = y[i];
        }
        Arrays.sort(z);
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
