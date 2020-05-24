package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task369 {
    public static void main(String[] args) {
        int n = 30;
        double[] x = ArrayGenerator.generateAsRandomDouble(n);
        ArrayGenerator.displayArrayDouble(x);
        double[] y = ArrayGenerator.generateAsRandomDouble(n);
        ArrayGenerator.displayArrayDouble(y);
        for (int i = 0; i < x.length; i++) {
            double min = x[ArrayGenerator.minIdentifierDouble(x)];
            if (min == Double.MIN_VALUE) {
                break;
            }
            System.out.println(min);
            boolean isExist = false;
            for (int j = 0; j < y.length; j++) {
                if (min == y[j]) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println(min);
                break;
            } else {
                for (int j = 0; j < x.length; j++) {
                    if (x[j] == min) {
                        x[j] = Double.MIN_VALUE;
                    }
                }
            }
        }
    }
}
