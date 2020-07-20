package com.jfk.lesson04.Tasks191_200;

public class Task199 {
    public static void main(String[] args) {
        int N = 9;
        double x = 0.5;
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(-1, i)*Math.pow(x, 2*i + 1) / (2*i + 1);
        }
        System.out.println(sum);
    }
}
