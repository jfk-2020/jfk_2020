package com.jfk.lesson04.Tasks081_090;

public class Task086 {
    public static void main(String[] args) {
        for (int xi = -50; xi <= 80; xi += 20) {
            double x = xi / 10.0;
            double y = -8;
            if (x > 2) {
                y = Math.pow(3, x + 4);
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
