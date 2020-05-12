package com.jfk.Lesson04.Tasks141_150;

public class Task143 {
    public static void main(String[] args) {
        System.out.println(calculate(15, 6, 3));
    }
    static double calculate(int m, int n, double a) {
        double sum = 1;
        for (int i = 0; i <= m; i++) {
            double sumi = 1;
            for (int j = 1; j <=n; j++) {
                sumi *= i / (i + a*j);
            }
            sum *= sumi;
        }
        return sum;
    }
}
