package com.jfk.Lesson04.Tasks141_150;

public class Task148 {
    public static void main(String[] args) {
        System.out.println(calculate(12, 7, 3));
    }
    static double calculate(int m, int n, double a) {
        double sum = 1;
        for (int i = 1; i <= m; i++) {
            double sumi = 0;
            for (int j = 1; j <=n; j++) {
                sumi += i*a + j * j;
            }
            sum *= (i + 1) * sumi;
        }
        return sum;
    }
}
