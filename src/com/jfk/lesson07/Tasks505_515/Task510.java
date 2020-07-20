package com.jfk.lesson07.Tasks505_515;

import com.jfk.lesson07.MatrixGenerator;

public class Task510 {
    public static void main(String[] args) {
        int n = 5;
        char[][] c = MatrixGenerator.generateAsRandomChar(n, n);
        MatrixGenerator.display(c);
        System.out.println("--------------------------------------");
        boolean t = false;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (c[i][j] == 's') {
                    t = true;
                    break;
                }
            }
            if (t) {
                break;
            }
        }
        System.out.println(t);
    }
}
