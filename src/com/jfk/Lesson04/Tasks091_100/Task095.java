package com.jfk.Lesson04.Tasks091_100;

public class Task095 {
    public static void main(String[] args) {
        System.out.println(calculation(10));
    }
    static double calculation(int n) {
        double sum = 0;
        double x = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                x = 1;
            } else {
                x = Math.pow(Math.sin(x), 2);
            }
            sum += (x*x - x);
        }
        return sum;
    }
}
