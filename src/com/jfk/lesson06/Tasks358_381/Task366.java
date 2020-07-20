package com.jfk.lesson06.Tasks358_381;

import com.jfk.lesson06.ArrayGenerator;

public class Task366 {
    public static void main(String[] args) {
        int n = 35;
        int[] a = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (i-1 <= a[i] && a[i] <= i) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The array is empty!");
        } else {
            int[] b = new int[count];
            int j = 0;
            for (int i = 1; i <= n; i++) {
                if (i-1 <= a[i] && a[i] <= i) {
                    b[j] = a[i];
                    j++;
                }
            }
            ArrayGenerator.displayArray(b);
        }
    }
}
