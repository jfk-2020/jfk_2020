package com.jfk.Lesson04.Tasks111_120;

public class Task119 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++){
            sum += Math.sin(3*x + 2*n + 2) / Math.pow(3, 2*n +2);
        }
        return sum;
    }
}
