package com.jfk.Lesson04.Tasks151_160;

public class Task158 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 2));
    }
    static double calculate(int n, double x) {
        double sum = 0;

        for (int i = 1; i <= n; i++){
            sum += 1/Task151.faktorial(i) + Math.sin(i + x) / Math.pow(x, i);
        }

        return sum;
    }
}
