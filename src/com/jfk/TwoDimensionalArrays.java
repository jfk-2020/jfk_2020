package com.jfk;

/**
 * @author William Arustamyan
 */

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        int[][] array = new int[3][4];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;

        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;

        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;


        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }

        int[][] arr = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}};


        int[][] array_no_second_size = new int[3][];
        array_no_second_size[0] = new int[3];
        array_no_second_size[1] = new int[33];
        System.out.println(array_no_second_size[0][0]);

        int[][][] abc = {{{12}, {3, 5}}};

        System.out.println(abc[0][1][1]);
        char[][] symbols = {
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
        };

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(symbols[i][k] + " ");
            }
            System.out.println();
        }
    }
}
