package com.jfk.lesson04.Tasks091_100;

public class Task098 {
    public static void main(String[] args) {
        System.out.println(calculation(10));
    }
    static double calculation(int n) {
        double sum = 0;
        double x = 0;
        for (int i = 0; i <= 2*n; i++) {
            if (i == 1) {
                x = 1;
            } else {
                x = 3.5 * Math.abs(x - 7);
            }
            sum += x;
        }
        return sum;
    }
}
