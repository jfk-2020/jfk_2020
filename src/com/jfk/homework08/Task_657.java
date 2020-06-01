package com.jfk.homework08;

public class Task_657 {
    public static void main(String[] args) {

        char[] charA = {'a', 'b', 'c', 'd', 'e', 'A', 'H', 'K'};
        char[] charB = new char[charA.length];

        for (int i = 0; i < charA.length; i += 2) {

            if (charA[i] > charA[i + 1]) {
                charB[i] = charA[i];

            } else {
                charB[i] = charA[i + 1];
            }
        }
        System.out.println(charB);

    }
}
