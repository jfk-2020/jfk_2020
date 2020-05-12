package com.jfk.Lesson04.Tasks131_140;

public class Task131 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (x > 1) {
            return Math.pow(3 * x, k + 1);
        } else {
            return  5*x + Math.pow(k,7);
        }
    }
}
