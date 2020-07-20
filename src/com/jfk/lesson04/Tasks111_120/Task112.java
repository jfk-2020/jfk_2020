package com.jfk.lesson04.Tasks111_120;

public class Task112 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum += Math.cos((2*n - 1) * x) / Math.pow(2, 2*n - 1);
        }
        return sum;
    }
}
