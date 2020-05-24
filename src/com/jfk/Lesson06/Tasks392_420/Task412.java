package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

import javax.swing.plaf.IconUIResource;

public class Task412 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        for (int i = 0; i < x.length; i++) {
            boolean isSimple = true;
            for (int j = 0; j < x.length; j++) {
                if (i == j) {
                    continue;
                }
                if (x[i] == x[j]) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.print(x[i] + " ");
            }
        }
    }
}
