package com.jfk.Lesson04.Tasks141_150;

public class Task141 {
    public static void main(String[] args) {
        System.out.println(calculate(5, 6, 3));
    }
    static double calculate(int m, int n, double a) {
        double sum = 1;
        for (int i = 0; i <= m; i++) {
            double sumi = 0;
            for (int j = 0; j <=n; j++) {
                sumi += Math.pow(a, i + j);
            }
            sum *= sumi;
        }
        return sum;
    }
}
