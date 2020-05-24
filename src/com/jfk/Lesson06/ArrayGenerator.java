package com.jfk.Lesson06;

import java.util.Random;

public class ArrayGenerator {
    private static final Random random = new Random();

    public static int[] generateAsRandom(int elementCount) {
        int[] array = new int[elementCount];
        for (int i = 0; i < array.length; i++) {
            int prefix = random.nextInt(11);
            if (prefix == 0) {
                array[i] = 0;
            } else if (prefix % 2 == 0) {
                array[i] = -1 * random.nextInt(100);
            } else {
                array[i] = random.nextInt(100);
            }
        }
        return array;
    }

    public static double[] generateAsRandomDouble(int elementCount) {
        double[] array = new double[elementCount];
        for (int i = 0; i < array.length; i++) {
            int prefix = random.nextInt(11);
            if (prefix == 0) {
                array[i] = 0;
            } else if (prefix % 2 == 0) {
                array[i] = -1 * Math.round(random.nextDouble()*100000) / 100.0;
            } else {
                array[i] = Math.round(random.nextDouble()*100000) / 100.0;
            }
        }
        return array;
    }

    public static char[] generateAsRandomChar(int elementCount) {
        char[] array = new char[elementCount];
        for (int i = 0; i < array.length; i++) {
            if (random.nextInt(2) == 0) {
                array[i] = (char)('a' + random.nextInt(27));
            } else {
                array[i] = (char)('A' + random.nextInt(27));
            }
        }
        return array;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void displayArrayDouble(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void displayArrayChar(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static int minIdentifier(int[] array){
        int identifier = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                identifier = i;
                min = array[i];
            }
        }
        return identifier;
    }

    public static int maxIdentifier(int[] array){
        int identifier = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > min) {
                identifier = i;
                min = array[i];
            }
        }
        return identifier;
    }

    public static int minIdentifierDouble(double[] array){
        int identifier = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                identifier = i;
                min = array[i];
            }
        }
        return identifier;
    }

    public static int maxIdentifierDouble(double[] array){
        int identifier = 0;
        double min = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > min) {
                identifier = i;
                min = array[i];
            }
        }
        return identifier;
    }

    public static boolean isExist(int[] x, int element) {
        boolean isExist = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == element) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }
}