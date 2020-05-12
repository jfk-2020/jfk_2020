package com.jfk.Lesson04.Tasks111_120;

public class Task118 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++){
            sum += Math.pow(Math.abs(2*x + 1), n) / ((n + 1) * (n + 2));
        }
        return sum;
    }
}
