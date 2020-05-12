package com.jfk.Lesson04.Tasks111_120;

public class Task117 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum += Math.pow(Math.log(x*x + 3), n) / ((2*n + 1)*n);
        }
        return sum;
    }
}
