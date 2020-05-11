package com.jfk.Lesson04.Tasks091_100;

public class Task093 {
    public static void main(String[] args) {
        System.out.println(calculation(10));
    }
    static double calculation(int n) {
        double sum = 1;
        double x = 0;
        for (int i = 5; i <= n; i++) {
            if (i == 5) {
                x = 0.5;
            } else {
                x = Math.tan(x + 2);
            }
            sum *= (x*x + x);
        }
        return sum;
    }
}
