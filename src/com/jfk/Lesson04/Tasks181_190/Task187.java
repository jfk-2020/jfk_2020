package com.jfk.Lesson04.Tasks181_190;

public class Task187 {
    public static void main(String[] args) {
        int N = 779;
        boolean t = true;
        for (int i = 2; i < N/2 + 1; i++){
            if (N % i == 0) {
                t = false;
                System.out.println(i);
                break;
            }
        }
        System.out.println(N + " " + t);
    }
}
