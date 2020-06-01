package com.jfk.homework08;

public class Task_656 {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        char[] charA = {'a', 'x', 'h', 'k', 'x', 'x', 'f'};

        for (int i = 0; i < charA.length; i++) {
            if (charA[i] == 'x') {
                count++;
            }
        }

        char[] charB = new char[n + count];
        int x = 0;
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] == 'x') {
                charB[i + x] = 'y';
                charB[i + x + 1] = 'y';
                x++;
            } else {
                charB[i + x] = charA[i];
            }
        }
        System.out.println(charB);
    }
}