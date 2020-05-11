package com.jfk.Lesson04.Tasks101_110;

public class Task104 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        double sum = 0;
        double x = -7;
        double y = 8;
        sum = x * x + 2 * y;
        for (int i = 1; i <= n; i++) {
            x = Math.pow(Math.sin(x), 2);
            y = y + 2;
            sum += (x * x + 2 * y);
            System.out.println("x = " + x + "; y = " + y + "; sum = " + sum);
        }
        return sum;
    }
}
