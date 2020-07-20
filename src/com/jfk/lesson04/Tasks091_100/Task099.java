package com.jfk.lesson04.Tasks091_100;

public class Task099 {
    public static void main(String[] args) {
        System.out.println(calculation(3));
    }
    static double calculation(int n) {
        double sum = 0;
        double x = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                x = 5;
            } else {
                x = x*x + 7;
            }
            sum += x*x;
        }
        return sum;
    }
}
