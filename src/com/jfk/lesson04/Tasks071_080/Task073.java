package com.jfk.lesson04.Tasks071_080;

public class Task073 {
    public static void main(String[] args) {
        for (double x = 7.4; x <= 12.5; x += 0.2) {
            double y = (x+1)*(x+1);
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
