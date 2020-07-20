package com.jfk.lesson04.Tasks141_150;

public class Task147 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 3));
    }
    static double calculate(int m, double a) {
        double sum = 0;
        for (int i = 0; i <= m; i++) {
            double sumi = 0;
            for (int j = 0; j <= i; j++) {
                sumi += a * i + j;
            }
            sum += (i + 5) * sumi;
        }
        return sum;
    }
}
