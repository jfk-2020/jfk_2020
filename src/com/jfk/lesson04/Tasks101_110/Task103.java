package com.jfk.lesson04.Tasks101_110;

public class Task103 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        if (n < 4) {
            return 0;
        }
        double sum = 1;
        double x = 2;
        double y = 1;
        sum = x*x + y;
        for (int i = 5; i <= n; i++) {
            x = x*x;
            y = Math.tan(y);
            sum *= (x*x + y);
            System.out.println("x = " + x + "; y = " + y + "; sum = " + sum);
        }
        return sum;
    }
}
