package com.jfk.Lesson04.Tasks111_120;

public class Task114 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum += (1.0 * n) / (n + 1) - Math.pow(Math.cos(Math.abs(x)), n);
        }
        return sum;
    }
}
