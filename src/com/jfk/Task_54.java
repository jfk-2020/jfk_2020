package com.jfk;

public class Task_54 {
    public static void main(String[] args) {

        int i = 324;
        int miavor = i % 10;
        int tasnavor = i % 100 / 10;
        int haryuravor = i / 100;

        System.out.println(haryuravor + " Haryuravor");
        System.out.println(tasnavor + " Tasnavor");
        System.out.println(miavor + " Miavor");

        if (miavor >= tasnavor) {
            if (miavor >= haryuravor
            ) {
                System.out.println(miavor + " max");
            } else {
                System.out.println(haryuravor + " max");
            }
        } else {
            if (tasnavor >= haryuravor) {
                System.out.println(tasnavor + " max");
            } else {
                System.out.println(haryuravor + "max");
            }
        }
    }
}