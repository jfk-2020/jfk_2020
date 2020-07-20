package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task398 {
    public static void main(String[] args) {
        int M = 4;
        int N = 5;
        int[][] x = MatrixGenerator.generateAsRandom(M, N);
        MatrixGenerator.display(x);
        int k = 0;
        int[] result = new int[x[0].length];
        for (int i = 0; i < x.length; i++){
            int element = x[0][i];
            boolean isExist = true;
            for (int j = 1; j < x.length; j++) {
                if (!ArrayGenerator.isExist(x[j], element)) {
                    isExist = false;
                    break;
                }
            }
            if (isExist) {
                result[k++] = element;
            }
        }
        if (k > 0) {
            int[] clearResult = ArrayGenerator.clearArray(result, k);
            ArrayGenerator.displayArray(clearResult);
        } else {
            System.out.println("NO");
        }
    }
}
