package com.jfk.Lesson04.Tasks101_110;

public class Task105 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        double sum = 0;
        double x = 1;
        double y = 1;
        sum = x*x + y;
        for (int i = 1; i < n; i++) {
            x = Math.sin(x) + 3;
            y = Math.cos(y);
            sum += (x*x + y);
            System.out.println("x = " + x + "; y = " + y + "; sum = " + sum);
        }
        return sum;
    }
}
