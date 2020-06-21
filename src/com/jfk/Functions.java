package com.jfk;

/**
 * @author William Arustamyan
 */

public class Functions {


    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 2, 1, 45},
                {2, 5, 65, 3, 98},
                {34, 2, 5, 3, 12},
                {53, 5, 3, 7, 2}
        };
        printMatrix(matrix, 4,5);
        System.out.println("AFTER FUNCTION CALL ");

        int recArea = calculateRectangleArea(10, 20);

        System.out.println("recArea = " + recArea);
    }

    static double triangleArea(int len, double h) {
        return (double) (len * h) / 2;
    }

    static void printMatrix(int[][] matrix, int rowCount, int columnCount) {
        if (matrix == null) {
            return;
        }
        System.out.println("BEFORE FOR LOOP");
        for (int i = 0; i < rowCount; i++) {
            for (int k = 0; k < columnCount; k++) {
                System.out.print(matrix[i][k] + " ");
                return;
            }
            System.out.println();
        }
        System.out.println("LAST LINE");
    }

    static int calculateRectangleArea(int x, int y) {
        return x * y;
    }

}
