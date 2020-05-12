package com.jfk.Lesson04.Tasks131_140;

public class Task137 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (2 < x && x < 6) {
            return Math.log(x) / Math.log(4) + Math.log(k);
        } else {
            return 4 * Math.pow(x + k, 8);
        }
    }
}
