package Tasks_from_392_to_401;

import com.jfk.ArrayElementGenerator;

public class Task_398 {
    public static void main(String[] args) {

        int[][] matrix = {
                {3, 5, 2, 1, 45},
                {2, 5, 2, 3, 98},
                {34, 2, 5, 3, 12},
                {53, 5, 3, 1, 2}
        };
        int m = 4, n = 5;
        int[] existingElements = new int[n];
        int[][] lookupMatrix = getLookupMatrixFromRowPosition(matrix, 1, m - 1, n);
        int c = 0;
        for (int i = 0; i < n; i++) {
            boolean isContains = isElementPresentInAllRows(matrix[0][i], lookupMatrix);
            if (isContains) {
                boolean existInExist = isElementPresentInRow(matrix[0][i], existingElements);
                if (!existInExist) {
                    existingElements[c++] = matrix[0][i];

                }
            }
        }
        int[] cleanArray = new int[c];
        for (int i = 0; i < c; i++) {
            cleanArray[i] = existingElements[i];
        }
        if (c == 0) {
            System.out.println("NO");
        } else {
            ArrayElementGenerator.displayArray(cleanArray);
        }
    }

    static boolean isElementPresentInAllRows(int element, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean isContains = isElementPresentInRow(element, matrix[i]);
            if (!isContains) {
                return false;
            }
        }
        return true;
    }

    static boolean isElementPresentInRow(int element, int[] row) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] == element) {
                return true;
            }
        }
        return false;
    }

    static int[][] getLookupMatrixFromRowPosition(int[][] originalMatrix, int rowPosition, int rowCount,
                                                  int columnSize) {
        int[][] lookupMatrix = new int[rowCount][columnSize];
        int m = 0;
        for (int i = rowPosition; i < originalMatrix.length; i++) {
            int n = 0;
            for (int k = 0; k < columnSize; k++) {
                lookupMatrix[m][n++] = originalMatrix[i][k];
            }
            m++;
        }
        return lookupMatrix;
    }
}
