package com.jfk.lesson04.Tasks181_190;

public class Task189 {
    public static void main(String[] args) {
        int N = 33;
        int f1 = 1;
        int f2 = 1;
        while (f2 < N) {
            int f = f2;
            f2 = f2 + f1;
            f1 = f;
        }
        System.out.println(f2 + f1);
    }
}
