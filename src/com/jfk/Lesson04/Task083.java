package com.jfk.Lesson04;

public class Task083 {
    public static void main(String[] args) {
        for (int xi = -48; xi <= 52; xi += 2) {
            double x = xi / 10.0;
            double y = Math.pow(Math.atan(x + 1), 2);
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
