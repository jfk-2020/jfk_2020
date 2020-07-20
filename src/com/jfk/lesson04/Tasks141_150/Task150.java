package com.jfk.lesson04.Tasks141_150;

public class Task150 {
    public static void main(String[] args) {
        System.out.println(calculate(10, 8, 3));
    }
    static double calculate(int m, int n, double a) {
        double sum = 1;
        for (int i = 1; i <= m; i++) {
            double sumi = 0;
            for (int j = 1; j <=n; j++) {
                sumi += Math.tan(a*i + j * j);
            }
            sum *= (i + 1)*sumi;
        }
        return sum;
    }
}
