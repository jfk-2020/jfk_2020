package com.jfk.lesson04.Tasks141_150;

public class Task142 {
    public static void main(String[] args) {
        System.out.println(calculate(9, 5, 3));
    }
    static double calculate(int k, int m, double a) {
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            double sumi = 0;
            for (int j = 1; j <=m; j++) {
                sumi += a * j * j + i * i;
            }
            sum += sumi;
        }
        return sum;
    }
}
