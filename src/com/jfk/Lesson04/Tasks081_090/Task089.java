package com.jfk.Lesson04.Tasks081_090;

public class Task089 {
    public static void main(String[] args) {
        for (int xi = -50; xi <= 9; xi += 15) {
            double x = xi / 10.0;
            double y = -9;
            if (x > 3) {
                y = Math.log(x) / Math.log(4);
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
