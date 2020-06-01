package com.jfk.homework08;

public class Task_653 {
    public static void main(String[] args) {
        int n = 7;
        char[] charA = {'a', 'a', 'b', 'c', 'd', 'h', 'a'};
        int count = 0;
        int k = 0;

        for (int i = 0; i < charA.length; i++) {
            if (charA[i] == 'a') {
                count++;
            }
        }
        char[] charB = new char[n + count];

        for (int i = 0; i < charA.length; i++) {
            charB[i + k] = charA[i];
            if (charA[i] == 'a') {
                k++;
                charB[i + k] = 'c';
            }
        }
        System.out.println(charB);
    }
}
