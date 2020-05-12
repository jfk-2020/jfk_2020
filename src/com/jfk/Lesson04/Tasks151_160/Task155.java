package com.jfk.Lesson04.Tasks151_160;

public class Task155 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 2));
    }
    static double calculate(int n, double x) {
        double sum = 0;

        for (int i = 1; i <= n; i++){
            sum += Math.pow(i, i) * Math.pow(x, 2*i) / Task151.faktorial(i);
        }

        return sum;
    }
}
