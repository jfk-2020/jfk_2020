package com.jfk.homework08;

public class Task_658 {
    public static void main(String[] args) {

        char[] charA = {'a', 'b', 'c', 'd', 'e', 'f', 'j', 'h'};
        char[] charB = new char[charA.length];

        for (int i = 0; i < charA.length; i += 2) {
            charB[i] = charA[i + 1];
            charB[i + 1] = charA[i];
        }
        System.out.println(charB);
    }
}

