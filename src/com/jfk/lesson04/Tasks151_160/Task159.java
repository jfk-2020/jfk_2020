package com.jfk.lesson04.Tasks151_160;

public class Task159 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 2));
    }
    static double calculate(int n, double x) {
        double sum = 1;

        for (int i = 1; i <= n; i++){
            sum *= Task151.faktorial(i) / (i + 1) - Math.pow(Math.cos(Math.abs(x)), i);
        }

        return sum;
    }
}
