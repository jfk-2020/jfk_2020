package com.jfk.Lesson04.Tasks101_110;

public class Task110 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        double sum = 1;
        double a = 1;
        double b = 1;
        sum = a + b;
        for (int i = 2; i <= n; i++) {
            a = Math.sin(a);
            b = Math.cos(b + 3);
            sum *= (a + b);
            System.out.println("a = " + a + "; b = " + b + "; sum = " + sum);
        }
        return sum;
    }
}
