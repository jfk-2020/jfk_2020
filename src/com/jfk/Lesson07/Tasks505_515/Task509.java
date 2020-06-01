package com.jfk.Lesson07.Tasks505_515;

import com.jfk.Lesson07.MatrixGenerator;

public class Task509 {
    public static void main(String[] args) {
        int n = 5;
        char[][] c = MatrixGenerator.generateAsRandomChar(n, n);
        MatrixGenerator.display(c);
        System.out.println("--------------------------------------");
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c[i].length; j++) {
                if (c[i][j] == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
