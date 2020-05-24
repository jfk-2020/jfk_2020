package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task413 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        int[] exists = new int[x.length];
        int count = 0;
        boolean haveZero = false;
        ArrayGenerator.displayArray(x);
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                if (haveZero) {
                    continue;
                } else {
                    haveZero = true;
                }
            } else if (ArrayGenerator.isExist(exists, x[i])){
                continue;
            }
            boolean isSimple = true;
            boolean isFirst = true;
            for (int j = 0; j < x.length; j++) {
                if (i == j) {
                    continue;
                }
                if (x[i] == x[j]) {
                    isSimple = false;
                    if (isFirst) {
                        isFirst = false;
                        System.out.print(x[i] + " = " + i + " " + j);
                    } else {
                        System.out.print(" " + j);
                    }
                }
            }
            if (!isSimple) {
                exists[count++] = x[i];
                System.out.println();
            }
        }
    }
}
