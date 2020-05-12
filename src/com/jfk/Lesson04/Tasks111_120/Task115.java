package com.jfk.Lesson04.Tasks111_120;

public class Task115 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum += n / (Math.pow(4, n) + Math.pow(Math.abs(x), n + 2));
        }
        return sum;
    }
}
