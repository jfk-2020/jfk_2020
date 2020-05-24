package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson06.Tasks358_381.Task367;

public class Task409 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int[] y = new int[x.length];
        int k = 0;
        for (int i = 0; i < x.length; i++) {
            if (Task367.isSimple(Math.abs(x[i]))) {
                y[k++] = x[i];
            }
        }
        if (k != 0) {
            int[] result = ArrayGenerator.clearArray(y, k);
            int max = result[ArrayGenerator.maxIdentifier(result)];
            ArrayGenerator.displayArray(result);
            System.out.println(max);
        } else {
            System.out.println("NO");
        }
    }
}
