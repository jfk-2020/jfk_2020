package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;
import org.w3c.dom.ls.LSOutput;

public class Task371 {
    public static void main(String[] args) {
        int n = 20;
        double[] x = ArrayGenerator.generateAsRandomDouble(n);
        ArrayGenerator.displayArrayDouble(x);
        double[] y = ArrayGenerator.generateAsRandomDouble(n);
        ArrayGenerator.displayArrayDouble(y);
        double max = 0;
        for (int i = 0; i < n; i++) {
            int radius = (int)Math.max(Math.abs(x[i]), Math.abs(y[i]));
            if (radius > max) {
                max = radius;
            }
        }
        System.out.println(2 * Math.PI * max);
    }
}
