package com.jfk.Lesson04.Tasks191_200;

import com.jfk.Lesson04.Tasks151_160.Task151;

public class Task197 {
    public static void main(String[] args) {
        int N = 9;
        double x = 2;
        double sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += Math.pow(-1, i)*Math.pow(x, 2*i) / Task151.faktorial(2*i);
        }
        System.out.println(sum);
    }
}
