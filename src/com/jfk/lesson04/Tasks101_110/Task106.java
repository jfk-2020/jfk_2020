package com.jfk.lesson04.Tasks101_110;

public class Task106 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        double sum = 0;
        double x = 3;
        double y = 3;
        sum = x*x + Math.sin(y);
        for (int i = 2; i < n - 2; i++) {
            x = x - y;
            y = y*y - 6;
            sum += (x*x + Math.sin(y));
            System.out.println("x = " + x + "; y = " + y + "; sum = " + sum);
        }
        return sum;
    }
}
