package com.jfk.homework06.homework451_460;

public class Task_451 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 5, 8}, //0
                {3, 6, 9}, //1
                {7, 4, 3}, //2
        };

        int[] b = new int[3];

        int average = 0;

        for (int i = 0; i < array.length; i++) {
//            b[i] = ((array[i][i]) + (array[i][array.length - 1 - i])) / 2;
            b[i] = findAverageValue(array[i][i], array[i][array.length -1 -i]);
            System.out.print(b[i] + " ");
        }
    }
    public static int findAverageValue(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }
}

