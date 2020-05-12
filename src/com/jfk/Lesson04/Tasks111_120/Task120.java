package com.jfk.Lesson04.Tasks111_120;

public class Task120 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++){
            sum += Math.pow(4, n + 1) * Math.pow(x + 1, n) / (n*n + 2*n + 3);
        }
        return sum;
    }
}
