package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task367 {
    public static void main(String[] args) {
        int a = 55;
        int b = 293;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isSimple(i)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The array is empty!");
        } else {
            int[] x = new int[count];
            int j = 0;
            for (int i = a; i <= b; i++) {
                if (isSimple(i)) {
                    x[j] = i;
                    j++;
                }
            }
            ArrayGenerator.displayArray(x);
        }
    }
    public static boolean isSimple(int x) {
        boolean simple = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                simple = false;
                break;
            }
        }
        return simple;
    }
}
