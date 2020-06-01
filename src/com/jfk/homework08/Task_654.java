package com.jfk.homework08;

public class Task_654 {
    public static void main(String[] args) {
        int n = 8;
        int count = 0;
        int k = 0;
        char[] charA = {'a', 'b', 'a', 'f', 'h', 'k', 'd', 'a'};

        for (int i = 0; i < charA.length; i++) {
            if (charA[i] == 'a') {
                count++;
            }
        }
        char[] charB = new char[n - count];
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] == 'a') {
                k--;
                continue;
            }
            if (i == 0) {
                charB[i] = charA[i];
            } else {
                charB[i + k] = charA[i];
            }
        }
        System.out.println(charB);
    }
}
