package com.jfk.Lesson04.Tasks141_150;

public class Task144 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 8, 3, 8));
    }
    static double calculate(int m, int n, double a, double b) {
        double sum = 0;
        for (int i = 1; i <= m; i++) {
            double sumi = 0;
            for (int j = 1; j <=n; j++) {
                sumi += b * Math.pow(a, i - j);
            }
            sum += sumi;
        }
        return sum;
    }
}
