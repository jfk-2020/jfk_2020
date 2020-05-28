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
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                if (i + k == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                if (4 - i <= k) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 11; k++) {
                if (k < 11 / 2 - i || k > 11 / 2 + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

