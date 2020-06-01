package com.jfk.homework08.homework686_694;

public class Task_686 {
    public static void main(String[] args) {
        int n = 3;
        char[] charA = {'a', 'b', 'c', 'd', 'h', 'j'};
        char[] charB = new char[charA.length * (n + 1)];

        int k = 0;
        for (int i = 0; i < charA.length; i++) {
            charB[i + k] = charA[i];

            for (int f = 0; f < 3; f++) {
                charB[i + k + 1] = ',';
                k++;
            }
        }
        System.out.println(charB);
    }
}

