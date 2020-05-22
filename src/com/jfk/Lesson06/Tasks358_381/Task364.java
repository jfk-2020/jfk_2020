package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task364 {
    public static void main(String[] args) {
        int n = 100;
        int[] a = ArrayGenerator.generateAsRandom(n - 1);
        ArrayGenerator.displayArray(a);
        boolean isSorted = true;
        for (int i = 1; i < a.length; i++) {
            if ((i + 2) * a[i - 1] < (i + 3) * a[i]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
