package com.jfk.Lesson04.Tasks081_090;

public class Task088 {
    public static void main(String[] args) {
        for (int xi = -30; xi <= 30; xi += 8) {
            double x = xi / 10.0;
            double y = x + 4;
            if (x > 1) {
                y = 6 * Math.pow(Math.E, 8 + x);
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
