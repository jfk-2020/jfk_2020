package com.jfk;

import java.util.Random;

/**
 * @author William Arustamyan
 */

public class Arrays {

    static Random generator = new Random();


    public static void main(String[] args) {
        int int_size = 5;

        int[] array = new int[int_size];


        for (int i = 0; i < array.length; i++) {
//            array[i] = generator.nextInt(20);
            array[i] = i + 1;
        }
//        System.out.println(array);

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        char[] char_text = {'F', 'A', 'L', 'S', 'E'};
//        char_text[0] = 'F';
//        char_text[1] = 'A';
//        char_text[2] = 'L';
//        char_text[3] = 'S';
//        char_text[4] = 'E';

        for (int i = 0; i < char_text.length; i++) {
            char_text[i] = (char) (char_text[i] + 32);
        }

        int[] ints = ArrayElementGenerator.generateAsRandom(12);
//        ArrayElementGenerator.displayArray(ints);
//        System.out.println(char_text);

//        for (int i = 0; i < 1000; i++) {
//            for (int k = 0; k < 1000; k++) {
//                for (int m = 0; m < 1000; m++) {
//                    System.out.println("i = " + i + ", k = " + k + ", m = " + m);
//                }
//            }
//        }

        for (int i = 0; i < 20; i++) {
            if (i == 5) {
                break;
            }
            if (i == 3) {
                continue;
            }
            System.out.println("i : " + i);
        }
        System.out.println("xxxx");
    }
}
