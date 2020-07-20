package com.jfk.lesson04.Tasks141_150;

public class Task149 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 8, 3));
    }
    static double calculate(int m, int n, double a) {
        double sum = 0;
        for (int i = 1; i <= m; i++) {
            double sumi = 1;
            for (int j = 1; j <=n; j++) {
                sumi *= Math.cos(a*i + j);
            }
            sum += Math.sin(i * i + 1)*sumi;
        }
        return sum;
    }
}
