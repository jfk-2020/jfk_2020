package com.jfk.lesson04.Tasks181_190;

public class Task188 {
    public static void main(String[] args) {
        int N = 34;
        int f1 = 1;
        int f2 = 1;
        while (f2 < N) {
            int f = f2;
            f2 = f2 + f1;
            f1 = f;
        }
        if (f2 == N ){
            System.out.println(f2);
            System.out.println(f1);
            System.out.println(N);
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
