package com.jfk.lesson04.Tasks181_190;

public class Task181 {
    public static void main(String[] args) {
        int N = 256;
        if (N == 1) {
            System.out.println(0);
        } else {
            int k = 1;
            int n2 = 2;
            while (n2 < N) {
                n2 *= 2;
                k++;
            }
            System.out.println(k);
        }
    }
}
