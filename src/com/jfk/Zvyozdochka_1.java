package com.jfk;

public class Zvyozdochka_1 {
    public static void main(String[] args) {
        char[][] symbols = {
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
        };

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print(symbols[i][k] + " ");
            }
            System.out.println();
        }
    }
}
