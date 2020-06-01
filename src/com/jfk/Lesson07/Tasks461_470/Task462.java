package com.jfk.Lesson07.Tasks461_470;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task462 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] XTemp = new int[m*m];
        int k = 0;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][i] == 0) {
                for (int j = 0; j < matrix[i].length; j++){
                    XTemp[k++] = matrix[i][j];
                }
            }
        }
        int[] X = ArrayGenerator.clearArray(XTemp, k);
        ArrayGenerator.displayArray(X);
    }
}
