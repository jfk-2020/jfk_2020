package com.jfk.Lesson04.Tasks111_120;

public class Task113 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++){
            sum += (1.0 / (2*n + 1)) * Math.pow((x - 1) / (x*x + 1), 2*n + 1);
        }
        return sum;
    }
}
