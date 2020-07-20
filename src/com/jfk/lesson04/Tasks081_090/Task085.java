package com.jfk.lesson04.Tasks081_090;

public class Task085 {
    public static void main(String[] args) {
        for (int xi = -33; xi <= 27; xi += 3) {
            double x = xi / 10.0;
            double y = Math.abs(2*x + x*x*x);
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
