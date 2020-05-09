package com.jfk;

/**
 * @author William Arustamyan
 */

public class Loops {


    public static void main(String[] args) {
        int sum = 0;

//        while (i < 10) {
//            sum = sum + i;
//            i = i + 1;
//        }
//        System.out.println("TOTAL : "  + sum);
//        do {
//            sum = sum + i;
//            i = i + 1;
//        } while (i < 10);

        for (int i = 0; i < 10; ++i) {
            sum = sum + i;
            System.out.println(sum);
        }

        int k = 0;
        System.out.println(k++);
        k = 0;
        System.out.println(++k);

    }
}
