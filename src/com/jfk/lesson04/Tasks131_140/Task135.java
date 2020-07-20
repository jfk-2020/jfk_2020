package com.jfk.lesson04.Tasks131_140;

public class Task135 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(calculate(5, i));
        }
    }
    static double calculate(double x, int k) {
        if (x > 1) {
            return Math.pow(x, k - 1);
        } else if (x < 3){
            return  x + Math.pow(k,3);
        } else {
            return Math.pow(10, -6);
        }
    }
}
