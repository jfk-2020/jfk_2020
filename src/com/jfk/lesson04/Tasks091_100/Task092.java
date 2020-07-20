package com.jfk.lesson04.Tasks091_100;

public class Task092 {
    public static void main(String[] args) {
        System.out.println(calculation(10));
    }
    static double calculation(int n) {
        double sum = 1;
        double x = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                x = 0.5;
            } else {
                x = Math.tan(x + 2);
            }
            sum *= x;
        }
        return sum;
    }
}
