package com.jfk.lesson04.Tasks151_160;

public class Task153 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 2));
    }
    static double calculate(int n, double x) {
        double sum = 0;

        for (int i = 0; i <= n; i++){
            sum += Math.pow(x, 2*i + 1) / Task151.faktorial(2*i + 1);
        }
        return sum;
    }
}
