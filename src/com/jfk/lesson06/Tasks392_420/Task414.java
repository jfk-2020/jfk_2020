package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;

public class Task414 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int t = 1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0 || x[i] > N) {
                t = 0;
                break;
            }
        }
        System.out.println(t);
    }
}
