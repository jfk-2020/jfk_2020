package com.jfk.lesson04.Tasks141_150;

public class Task146 {
    public static void main(String[] args) {
        System.out.println(calculate(5, 8, 3));
    }
    static double calculate(int m, int n, double a) {
        double sum = 0;
        for (int i = 1; i <= m; i++) {
            double sumi = 0;
            for (int j = 1; j <=n; j++) {
                sumi += (a*i + j) / j;
            }
            sum += i*i * sumi;
        }
        return sum;
    }
}
