package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

import java.util.Arrays;

public class Task408 {

    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        Arrays.sort(x);
        ArrayGenerator.displayArray(x);
        int delta = x[1] / x[0];
        boolean isProgress = true;
        for (int i = 2; i < x.length; i++) {
            if (x[i - 1] == 0) {
                continue;
            }
            if (x[i] / x[i - 1] != delta) {
                isProgress = false;
                break;
            }
        }
        if (isProgress) {
            System.out.println(delta);
        } else {
            System.out.println(0);
        }
    }

}
