package com.jfk.Lesson04.Tasks191_200;

public class Task191 {
    public static void main(String[] args) {
        int N = 5;
        double x = 2.5;
        double sum = 0;
        for (int i = 0; i <=N; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println(sum);
    }
}
