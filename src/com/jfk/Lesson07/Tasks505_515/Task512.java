package com.jfk.Lesson07.Tasks505_515;

import com.jfk.Lesson07.MatrixGenerator;

public class Task512 {
    public static void main(String[] args) {
        int n = 5;
        char[][] c = MatrixGenerator.generateAsRandomChar(n, n);
        MatrixGenerator.display(c);
        System.out.println("--------------------------------------");
        boolean t = false;
        char cMax = Character.MIN_VALUE;
        for (int i = 0; i < c.length; i++) {
            for (int j = c[i].length - 1 - i; j < c[i].length; j++) {
                if (cMax < c[i][j]) {
                    cMax = c[i][j];
                }
            }
        }
        t = (cMax == 'z');
        System.out.println(cMax);
        System.out.println(t);
    }
}
