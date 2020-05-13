package com.jfk.Lesson04.Tasks191_200;

import com.jfk.Lesson04.Tasks151_160.Task151;

public class Task195 {
    public static void main(String[] args) {
        int N = 9;
        double x = 2;
        double sum = 1;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(x, i) / Task151.faktorial(i);
        }
        System.out.println(sum);
    }
}
