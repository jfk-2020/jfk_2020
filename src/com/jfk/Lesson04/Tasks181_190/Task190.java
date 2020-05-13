package com.jfk.Lesson04.Tasks181_190;

public class Task190 {
    public static void main(String[] args) {
        double e = 0.5;
        double x1 = 1;
        double x2 = 2;
        int k = 2;
        while (Math.abs(x2 - x1) > e) {
            k++;
            double x = x1;
            x2 = (x1 + 2*x2)/3;
            x1 = x;
        }
        System.out.println(k);
    }
}
