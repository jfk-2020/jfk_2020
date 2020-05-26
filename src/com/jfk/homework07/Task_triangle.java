package com.jfk.homework07;

public class Task_triangle {
    public static void main(String[] args) {
        char[][] asterisk = {
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'}
        };

        for (int i = 0; i < asterisk.length; i++) {
            for (int k = 0; k < asterisk[i].length - i - 1; k++) {
                System.out.print(asterisk[i][k] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < asterisk.length; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(asterisk[i][k] + " ");
            }
            System.out.println();
        }
    }
}

