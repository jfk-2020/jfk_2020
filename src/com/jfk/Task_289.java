package com.jfk;

/**
 * @author William Arustamyan
 */

public class Task_289 {


    public static void main(String[] args) {

        int c = 10;
        int d = 500;

        int[] x = {c, 4, 70, -4, 32, 5, 0, 2, 5, 7, 5, 2};

        int[] y;
        int counter = 0;

        for (int i = 0; i < x.length; i++) {
            int square = x[i] * x[i];
            if (square > c && square < d) {
                counter++;
            }
        }
        if (counter > 0) {
            y = new int[counter];
            int index = 0;
            for (int i = 0; i < x.length; i++) {
                int square = x[i] * x[i];
                if (square > c && square < d) {
                    y[index++] = x[i];
                }
            }
            ArrayElementGenerator.displayArray(y);
        }
    }
}
