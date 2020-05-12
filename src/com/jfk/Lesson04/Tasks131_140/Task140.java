package com.jfk.Lesson04.Tasks131_140;

public class Task140 {
    public static void main(String[] args) {
        for (int i = 2; i < 11; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (3 < x && x < 5) {
            return Math.pow(x, k + 6);
        } else if (x <= 3){
            return  x + Math.pow(k,4);
        } else {
            return Math.pow(5, 6);
        }
    }
}
