package com.jfk.Lesson04.Tasks151_160;

public class Task157 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 2));
    }
    static double calculate(int n, double x) {
        double sum = 1;

        for (int i = 1; i <= n; i++){
            sum *= Math.pow(-1, i) / Math.pow(2 * x + 1, i) * Task151.faktorial(i);
        }

        return sum;
    }
}
