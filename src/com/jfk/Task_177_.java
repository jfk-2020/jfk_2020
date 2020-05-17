package com.jfk;

public class Task_177_ {
    public static void main(String[] args) {
        int N = 10;
        double x1 = 1;
        double x2 = 2;
        System.out.println(x1);
        System.out.println(x2);
        for (int k = 3; k <= N; k++){
            double x = x1;
            x2 = (x1 + 2*x2) / 3;
            x1 = x;
            System.out.println(x2);
        }
    }
}
