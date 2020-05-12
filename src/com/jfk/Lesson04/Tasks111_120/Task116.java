package com.jfk.Lesson04.Tasks111_120;

public class Task116 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum += Math.pow(2*x + 1, n) / (n + 5) * Math.log(x*x + 1);
        }
        return sum;
    }
}
