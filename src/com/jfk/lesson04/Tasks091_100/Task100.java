package com.jfk.lesson04.Tasks091_100;

public class Task100 {
    public static void main(String[] args) {
        System.out.println(calculation(10));
    }
    static double calculation(int n) {
        double sum = 1;
        double x = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                x = 1;
            } else {
                x = Math.atan(x) + 1;
            }
            sum *= x;
        }
        return sum;
    }
}
