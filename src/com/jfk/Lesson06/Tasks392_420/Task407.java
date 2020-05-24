package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

import java.util.Arrays;

public class Task407 {
    public static void main(String[] args) {
        isProgress(true, false);
        for (int i = 0; i < 100000; i++) {
            isProgress(false, false);
        }
        isProgress(true, true);
    }
    static void isProgress(boolean viewZero, boolean withArray) {
        int N = 20;
        int[] x;
        if (withArray) {
            x = new int[4];
            x[0] = 1;
            x[1] = 2;
            x[2] = 3;
            x[3] = 4;
        } else {
            x = ArrayGenerator.generateAsRandom(N);
        }
        Arrays.sort(x);
        if (viewZero) {
            ArrayGenerator.displayArray(x);
        }
        int delta = x[1] - x[0];
        boolean isProgress = true;
        for (int i = 2; i < x.length; i++){
            if (x[i] - x[i - 1] != delta) {
                isProgress = false;
                break;
            }
        }
        if (isProgress) {
            System.out.println(delta);
        } else {
            if (viewZero) {
                System.out.println(0);
            }
        }
    }
}
