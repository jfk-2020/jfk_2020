package com.jfk.homework06;

public class Task_401 {
    public static void main(String[] args) {

        int firstZero = -1; //attribute -1, as the first number also can be 0
        int lastZero = -1;
        int[] array = new int[]{1, 3, 5, 0, 10, 8, 7, 0, 3};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && firstZero == -1) {
                firstZero = i;
            }
            //check if from beginning and from ending 0 is found
            if (array[array.length - 1 - i] == 0 && lastZero == -1) {
                lastZero = array.length - 1 - i;
            }
            if (firstZero != -1 && lastZero != -1) {
                break;
            }
        }

        if (firstZero == lastZero - 1) {
            System.out.println(0);
        } else {
            int product = 1;
            for (int i = firstZero + 1; i < lastZero; i++) {
                product *= array[i];
            }
            System.out.println(product);
        }
    }
}
