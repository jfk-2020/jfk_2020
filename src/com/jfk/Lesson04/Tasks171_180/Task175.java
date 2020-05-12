package com.jfk.Lesson04.Tasks171_180;

public class Task175 {
    public static void main(String[] args) {
        int N = 10;
        double x = 1;
        System.out.println(x);
        for (int k = 2; k <= N; k++){
            x = (x + 1)/k;
            System.out.println(x);
        }
    }
}
