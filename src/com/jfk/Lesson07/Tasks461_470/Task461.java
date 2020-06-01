package com.jfk.Lesson07.Tasks461_470;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task461 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] XTemp = new int[m*m];
        int a = 25;
        int b = 1200;
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (a <= Math.pow(matrix[i][j], 2) && Math.pow(matrix[i][j] , 2) <= b) {
                    XTemp[k++] = matrix[i][j];
                }
            }
        }
        int[] X = ArrayGenerator.clearArray(XTemp, k);
        ArrayGenerator.displayArray(X);
    }
}
