package com.jfk.homework08;

public class Task_655 {
    public static void main(String[] args) {
        int n = 4;
        int m = (2 * n) + 1;
        char[] charA = {'a', 'b', 'c', 'd', 'e', 'f', 'h', 'k', 'l'};

        char[] charB = new char[charA.length];
        for (int i = 0; i < m; i++) {
            charB[charA.length - 1 - i] = charA[i];
        }
        System.out.println(charB);
    }
}
