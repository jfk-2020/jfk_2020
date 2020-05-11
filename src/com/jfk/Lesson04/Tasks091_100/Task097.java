package com.jfk.Lesson04.Tasks091_100;

public class Task097 {
    public static void main(String[] args) {
        System.out.println(calculation(10));
    }
    static double calculation(int n) {
        double sum = 1;
        double x = 0;
        for (int i = 0; i <= 3*n; i++) {
            if (i == 1) {
                x = 1;
            } else {
                x = 0.5 * x + 7;
            }
            sum *= x;
        }
        return sum;
    }
}
