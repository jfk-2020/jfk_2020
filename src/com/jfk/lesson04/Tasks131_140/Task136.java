package com.jfk.lesson04.Tasks131_140;

public class Task136 {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (3 < x && x < 7) {
            return 9 * Math.pow(x, k);
        } else {
            return 8 * x + Math.pow(k, 3);
        }
    }
}
