package com.jfk.Lesson04.Tasks141_150;

public class Task145 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 8, 3));
    }
    static double calculate(int m, int n, double a) {
        double sum = 0;
        for (int i = 0; i <= m; i++) {
            double sumi = 1;
            for (int j = 0; j <=n; j++) {
                sumi *= i*i + a * j;
            }
            sum += sumi;
        }
        return sum;
    }
}
