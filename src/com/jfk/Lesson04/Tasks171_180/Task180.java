package com.jfk.Lesson04.Tasks171_180;

public class Task180 {
    public static void main(String[] args) {
        int N = 80;
        int sum = 1;
        while (sum < N) {
            sum *= 3;
        }
        System.out.println(sum == N);
    }
}
