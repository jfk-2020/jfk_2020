package com.jfk.homework06;

import com.jfk.ArrayElementGenerator;

public class Task_396 {
    public static void main(String[] args) {
        int[] x = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(x);

        boolean isNegative = false; //add variable to check if the number is negative
        boolean isZeroAdded = false; //add variable to check is zero added
        int[] y = new int[x.length + 1]; //create a new array
        int z = 0; //add variable for new array's index

        for (int i = 0; i < x.length; i++, z++) {
            //check the number is negative
            if (x[i] < 0) {
               isNegative = true;
            }
            y[z] = x[i];

            if (isNegative && !isZeroAdded) {
                z++;
                y[z] = 0;
                isZeroAdded = true;
            }
        }
        ArrayElementGenerator.displayArray(y);
    }
}

