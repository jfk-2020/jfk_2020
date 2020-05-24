package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task368 {
    public static void main(String[] args) {
        int n = 20;
        double[] x = ArrayGenerator.generateAsRandomDouble(n);
        ArrayGenerator.displayArrayDouble(x);
        double[] y = ArrayGenerator.generateAsRandomDouble(n);
        ArrayGenerator.displayArrayDouble(y);
        double max = 0;
        int k1 = -1;
        int k2 = -1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double x1 = 0;
                if ((x[i] > 0 && x[j] < 0) || (x[i] < 0 && x[j] > 0)) {
                    x1 = Math.abs(x[i]) + Math.abs(x[j]);
                } else {
                    x1 = Math.abs(x[i] - x[j]);
                }
                double y1 = 0;
                if ((y[i] > 0 && y[j] < 0) || (y[i] < 0 && y[j] > 0)) {
                    y1 = Math.abs(y[i]) + Math.abs(y[j]);
                } else {
                    y1 = Math.abs(y[i] - y[j]);
                }
                double distance = Math.sqrt(x1*x1 + y1*y1);
                if (distance > max) {
                    max = distance;
                    k1 = i;
                    k2 = j;
                }
            }
        }
        System.out.println(k1);
        System.out.println(k2);
    }
}
