package com.jfk.homework08;

public class Task_651 {
    public static void main(String[] args) {

        char[] charsA = {'a', 'b', 'c', 'a', 'c', 'd', 'g'};

        int count = 0;
        int b = 0;
        char[] charsB = new char[charsA.length];

        for (int i = 0; i < charsA.length; i++) {
            for (int k = 0; k < charsA.length; k++) {
                if (charsA[i] == charsA[k]) {
                    count++;
                }
            }

            if (count == 1) {
                charsB[b] = charsA[i];
                b++;
            }
            count = 0;
        }

        for (int i = 0; i < charsB.length; i++) {
            System.out.print(charsB[i] + " ");
        }
        System.out.println();
    }
}
