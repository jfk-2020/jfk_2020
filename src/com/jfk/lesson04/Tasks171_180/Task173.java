package com.jfk.lesson04.Tasks171_180;

public class Task173 {
    public static void main(String[] args) {
        int N = 3;
        double A = 10;
        double B = 90;
        int H = (int)(B - A) / N;
        System.out.println(H);
        for (double i = A; i < B; i += H) {
            System.out.println(i);
        }
        System.out.println(B);
    }
}
