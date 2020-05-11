package com.jfk.Lesson04;

import java.text.DecimalFormat;

public class Task082 {
    public static void main(String[] args) {
        for (int xi = -27; xi <= 33; xi = xi + 5) {
            double x = xi / 10.0;
            double y = Math.pow(x +x*x, 7);
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
