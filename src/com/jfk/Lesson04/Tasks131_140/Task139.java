package com.jfk.Lesson04.Tasks131_140;

public class Task139 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (2 <x && x < 5) {
            return 7 * Math.pow(Math.E, k + 1);
        } else if (0 <x && x <= 5){
            return  8 * x + Math.pow(k, 5);
        } else {
            return 7;
        }
    }
}
