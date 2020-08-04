package Homework;

public class Task_59 {
    public static void main(String[] args) {
        int i = 787;
        int miansh = i % 10;
        int tasnavor = i % 100 / 10;
        int haryuravor = i / 100;

        int max, min, mid;

        if (miansh >= tasnavor) {
            if (tasnavor >= haryuravor) {
                min = haryuravor;
                mid = tasnavor;
                max = miansh;
            } else {
                min = tasnavor;
                mid = miansh;
                max = haryuravor;
            }
            System.out.println(min);
            System.out.println(mid);
            System.out.println(max);
        } else {
            if (tasnavor >= haryuravor) {
                if (miansh >= haryuravor) {
                    min = haryuravor;
                    mid = miansh;
                    max = tasnavor;
                } else {
                    min = miansh;
                    mid = haryuravor;
                    max = tasnavor;
                }
            } else {
                min = miansh;
                mid = tasnavor;
                max = haryuravor;
            }

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
    }
}