package com.jfk.Lesson04.Tasks171_180;

public class Task179 {
    public static void main(String[] args) {
        int N = 80;
        int K = 3;
        int sum = 0;
        int i = 0;
        while (sum <= N) {
            sum += K;
            i++;
        }
        i--;
        sum -= K;
        System.out.println(i);
        System.out.println(N - sum);
    }
}