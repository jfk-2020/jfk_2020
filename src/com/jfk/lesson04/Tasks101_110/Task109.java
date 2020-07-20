package com.jfk.lesson04.Tasks101_110;

public class Task109 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        double sum = 0;
        double a = 1;
        double b = 2;
        sum = a + b*b;
        for (int i = 2; i <= n; i++) {
            a = 6*a - 4;
            b = 5*Math.tan(b) + 3;
            sum += (a + b*b);
            System.out.println("a = " + a + "; b = " + b + "; sum = " + sum);
        }
        return sum;
    }
}
