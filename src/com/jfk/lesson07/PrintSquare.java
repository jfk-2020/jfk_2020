package com.jfk.lesson07;

public class PrintSquare {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || i == x-1) {
                    System.out.print("* ");
                } else if (j == 0 || j== y -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
