package com.jfk.Lesson04.Tasks191_200;

public class Task192 {
    public static void main(String[] args) {
        int N = 7;
        double x = 2.2;
        double sum = 0;
        for (int i = 0; i <= N; i++){
            sum += Math.pow(-1, i) * Math.pow(x, i);
        }
        System.out.println(sum);
    }
}
