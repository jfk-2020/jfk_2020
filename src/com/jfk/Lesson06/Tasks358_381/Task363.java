package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task363 {
    public static void main(String[] args) {
        int n = 35;
        int count = 0;
        for (int i = 1; i <=n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] x = new int[count];
        int j = 0;
        for (int i = 1; i <=n; i++) {
            if (n % i == 0) {
                x[j] = i;
                j++;
            }
        }
        ArrayGenerator.displayArray(x);
    }
}
