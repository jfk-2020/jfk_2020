package com.jfk.Lesson04.Tasks091_100;

public class Task091 {
    public static void main(String[] args) {
        System.out.println(calculation(10));
    }
    static double calculation(int n) {
        double sum = 0;
        double x = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                x = 1;
            } else {
                x = 0.5 * Math.abs(x - 4);
            }
            sum += x * x;
        }
        return sum;
    }
}
