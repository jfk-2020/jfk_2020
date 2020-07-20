package com.jfk.lesson04.Tasks191_200;

import com.jfk.lesson04.Tasks151_160.Task151;

public class Task194 {
    public static void main(String[] args) {
        int N = 9;
        double sum = 1;
        for (int i = 1; i <= N; i++) {
            sum += 1 / Task151.faktorial(i);
        }
        System.out.println(sum);
    }
}
