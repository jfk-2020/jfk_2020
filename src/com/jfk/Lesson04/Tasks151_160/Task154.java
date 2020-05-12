package com.jfk.Lesson04.Tasks151_160;

public class Task154 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 2));
    }
    static double calculate(int n, double x) {
        double sum = 0;

        for (int i = 1; i <= n; i++){
            sum += (Task151.faktorial(2*i) + Math.abs(x)) / Task151.faktorial(i*i);
        }

        return sum;
    }
}
