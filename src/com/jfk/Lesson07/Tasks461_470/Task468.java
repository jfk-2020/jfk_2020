package com.jfk.Lesson07.Tasks461_470;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;
import org.w3c.dom.ls.LSOutput;

public class Task468 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] X = new int[m];
        int sumHead = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumHead += matrix[i][i];
        }
        System.out.println(sumHead);
        for (int i = 0; i < matrix.length; i++) {
            X[i] = sumHead + matrix[i][matrix[i].length - 1 - i];
        }
        ArrayGenerator.displayArray(X);
    }
}
