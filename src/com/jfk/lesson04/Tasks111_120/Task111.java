package com.jfk.lesson04.Tasks111_120;

public class Task111 {
    public static void main(String[] args) {
        System.out.println(calculate(2, 5));
    }
    static double calculate(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++){
            sum += Math.pow(x, 4*n + 1) / (4*n + 1);
        }
        return sum;
    }
}
