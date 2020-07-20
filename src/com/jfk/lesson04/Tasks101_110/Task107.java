package com.jfk.lesson04.Tasks101_110;

public class Task107 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        double sum = 1;
        double x = 1;
        double y = 1;
        sum = Math.cos(x + y);
        for (int i = 1; i <= 3*n; i++) {
            x = x/2;
            y = y/3;
            sum *= Math.cos(x + y);
            System.out.println("x = " + x + "; y = " + y + "; sum = " + sum);
        }
        return sum;
    }
}
