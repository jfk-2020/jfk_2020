package com.jfk.lesson04.Tasks101_110;

public class Task102 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        double sum = 1;
        double x = 2;
        double y = 0.5;
        sum = x - y;
        for (int i = 2; i <= n; i++) {
            x = (x + 2) * (x + 2);
            y = y + 6;
            sum *= (x - y);
            System.out.println("x = " + x + "; y = " + y + "; sum = " + sum);
        }
        return sum;
    }
}
