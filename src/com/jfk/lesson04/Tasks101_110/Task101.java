package com.jfk.lesson04.Tasks101_110;

public class Task101 {
    public static void main(String[] args) {
        System.out.println("Sum = " + calculate(10));
    }
    static double calculate(int n) {
        double sum = 0;
        double x = 1;
        double y = 2;
        sum = (x + y) * (x + y);
        for (int i = 2; i <=  n; i++) {
            x = 2 * (x + 3);
            y = y * y - 4;
            sum += (x + y) * (x + y);
            System.out.println("x = " + x + "; y = " + y + "; sum = " + sum);
        }
        return sum;
    }
}
