package com.jfk;

/**
 * @author William Arustamyan
 */

public class Task_427 {


    public static void main(String[] args) {
//        int m = 3;
//        int[][] array = new int[m][m];
        int[][] array = {
                {3, 6, 8, 6}, //0
                {4, 3, 6, 1}, //1
                {2, 5, 8, 9}, //2
                {1, 3, 4, 3}  //3
             //  0  1  2  3
        };

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }

        int sum = 1;
        int n = 2;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length - i; k++) {
                if (array[i][k] % n == 0) {
                    sum = sum * array[i][k];
                }
//                System.out.print(array[i][k] + " ");
            }
//            System.out.println();
        }

        System.out.println(sum);



    }
}
