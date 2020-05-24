package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task375 {
    public static void main(String[] args) {
        int n = 100;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        int count = 0;
        boolean t = false;
        for (int i = 0; i < x.length; i++){
            if (x[i] == 0) {
                count++;
                if (count > 2) {
                    t = true;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(t);
    }
}
