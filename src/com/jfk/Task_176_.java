package com.jfk;

public class Task_176_ {
    public static void main(String[] args) {
        int N = 10;
        int F1 = 1;
        int F2 = 1;
        System.out.println(F1);
        System.out.println(F2);
        for (int k = 3; k <= N; k++) {
            int f = F2;
            F2 = F2 + F1;
            F1 = f;
            System.out.println(F2);
        }
    }
}
