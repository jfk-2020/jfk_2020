package com.jfk.lesson04.Tasks181_190;

public class Task184 {
    public static void main(String[] args) {
        int N = 55;
        int k = 1;
        int n3 = 3;
        if (N < 3) {
            System.out.println(0);
        } else {
            while (n3 <= N) {
                n3 *= 3;
                k++;
            }
            System.out.println(k - 1);;
        }
    }
}
