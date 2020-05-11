package com.jfk.Lesson04.Tasks101_110;

public class Task108 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }

    static double calculate(int n) {
        double sum = 0;
        double x = 1;
        double y = 1;
        sum = x + y*y;
        for (int i = n + 1; i <= 2*n; i++) {
            x = 5*(x+3);
            y = 5*y + 2;
            sum += (x + y*y);
            System.out.println("x = " + x + "; y = " + y + "; sum = " + sum);
        }
        return sum;
    }
}
