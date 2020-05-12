package com.jfk.Lesson04.Tasks131_140;

public class Task138 {
    public static void main(String[] args) {
        for (int i = 2; i < 8; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (x < 6) {
            return Math.pow(x, k) + k;
        } else {
            return Math.log(k) / Math.log(5);
        }
    }
}
