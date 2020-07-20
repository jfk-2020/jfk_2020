package com.jfk.lesson04.Tasks151_160;

public class Task160 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 2));
    }
    static double calculate(int n, double x) {
        double sum = 1;

        for (int i = 1; i <= n; i++){
            sum *= (x + Math.cos(i*x)) / Math.pow(2, i) * Task151.faktorial(i);
        }

        return sum;
    }
}
