package com.jfk.Lesson07.Tasks505_515;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task511 {
    public static void main(String[] args) {
        int n = 5;
        char[][] c = MatrixGenerator.generateAsRandomChar(n, n);
        MatrixGenerator.display(c);
        System.out.println("--------------------------------------");
        char[] b = new char[n];
        for (int i = 0; i < c.length; i++) {
            char cMax = Character.MIN_VALUE;
            char cMin = Character.MAX_VALUE;
            for (int j = 0; j < c[i].length; j++) {
                if (cMax < c[i][j]) {
                    cMax = c[i][j];
                }
                if (cMin > c[i][j]) {
                    cMin = c[i][j];
                }
            }
            b[i] = (char) ((cMax + cMin) / 2);
        }
        ArrayGenerator.displayArray(b);
    }
}
