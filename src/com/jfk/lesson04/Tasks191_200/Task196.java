package com.jfk.lesson04.Tasks191_200;

import com.jfk.lesson04.Tasks151_160.Task151;

public class Task196 {
    public static void main(String[] args) {
        int N = 9;
        double x = 2;
        double sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += Math.pow(-1, i)*Math.pow(x, 2*i+1) / Task151.faktorial(2*i + 1);
        }
        System.out.println(sum);
    }
}
