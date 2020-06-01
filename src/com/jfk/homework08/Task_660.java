package com.jfk.homework08;

public class Task_660 {
    public static void main(String[] args) {
        int n = 8;
        char[] charA = {'c', 'd', 'x', 'h', 'c', 'l', 'c', 'c'};
        char[] charB = new char[charA.length];

        for (int i = 0; i < charA.length; i++) {
            if (i % 3 == 0) {
                charB[i] = 'a';
            } else {
                charB[i] = charA[i];
            }
        }
        System.out.println(charB);
    }
}

