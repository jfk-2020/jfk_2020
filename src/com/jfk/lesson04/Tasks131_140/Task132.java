package com.jfk.lesson04.Tasks131_140;

public class Task132 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (x > 5) {
            return 3 * (Math.log(x) / Math.log(3)) * x + 5 * k;
        } else {
            return  4*Math.pow(x + k, 8);
        }
    }
}
