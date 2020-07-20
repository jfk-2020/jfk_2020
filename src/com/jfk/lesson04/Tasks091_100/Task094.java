package com.jfk.lesson04.Tasks091_100;

public class Task094 {
    public static void main(String[] args) {
        System.out.println(calculation(10));
    }
    static double calculation(int n) {
        double sum = 0;
        double x = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                x = -4.2;
            } else {
                x = 0.5 * Math.atan(x);
            }
            sum += (x * x - 2 * x);
        }
        return sum;
    }
}
