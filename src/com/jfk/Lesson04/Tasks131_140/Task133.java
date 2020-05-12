package com.jfk.Lesson04.Tasks131_140;

public class Task133 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (x < 1) {
            return 8 * Math.pow(x, k);
        } else {
            return 7 * x + Math.log(x) / Math.log(3);
        }
    }
}
