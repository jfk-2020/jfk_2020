package com.jfk.Lesson04.Tasks181_190;

public class Task183 {
    public static void main(String[] args) {
        int N = 55;
        int k = 1;
        int n3 = 3;
        if (N < 3) {
            System.out.println(k);
        } else {
            while (n3 <= N) {
                n3 *= 3;
                k++;
            }
            System.out.println(k);;
        }
    }
}
