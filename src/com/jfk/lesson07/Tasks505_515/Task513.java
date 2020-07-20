package com.jfk.lesson07.Tasks505_515;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task513 {
    public static void main(String[] args) {
        int n = 5;
        char[][] c = MatrixGenerator.generateAsRandomChar(n, n);
        MatrixGenerator.display(c);
        System.out.println("--------------------------------------");
        char[] b = new char[n];
        for (int i = 0; i < c.length; i++) {
            b[i] = c[i][i];
        }
        ArrayGenerator.displayArray(b);
    }
}
