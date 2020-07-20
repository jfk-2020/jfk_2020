package com.jfk.lesson07.Tasks505_515;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task514 {
    public static void main(String[] args) {
        int n = 5;
        char[][] c = MatrixGenerator.generateAsRandomChar(n, n);
        MatrixGenerator.display(c);
        System.out.println("--------------------------------------");
        char[] b = new char[n];
        for (int i = 0; i < c.length; i++) {
            char cMax = Character.MIN_VALUE;
            for (int j = 0; j < c[i].length; j++) {
                if (cMax < c[i][j]) {
                    cMax = c[i][j];
                }
            }
            b[i] = cMax;
        }
        ArrayGenerator.displayArray(b);
    }
}
