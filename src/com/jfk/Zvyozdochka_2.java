package com.jfk;

public class Zvyozdochka_2 {
    public static void main(String[] args) {
        char[][] symbols = {
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
        };

        for (int i = 0; i < symbols.length; i++) {
            for (int k = 0; k < symbols[i].length - i; k++) {
                System.out.print(symbols[i][k] + " ");
            }
            System.out.println();
        }
    }
}
