package com.jfk.homework08;

public class Task_652 {
    public static void main(String[] args) {
        int n = 7;
        char[] charsA = {'a', 'b', 'c', 'd', 'f', 'g', 'h'};
        char[] charsB = {'a', 'c', 'd', 'i', 'g', 'k', 'l'};

        int b = 0;
        char[] charsC = new char[n];

        for (int i = 0; i < charsA.length; i++) {
            for (int k = 0; k < charsB.length; k++) {
                if (charsA[i] == charsB[k]) {
                    charsC[b] = charsB[k];
                    b++;
                }
            }
        }
        for (int i = 0; i < charsC.length; i++) {
            System.out.print(charsC[i] + " ");
        }
        System.out.println();
    }
}
