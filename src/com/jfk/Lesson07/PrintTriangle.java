package com.jfk.Lesson07;

public class PrintTriangle {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        int k1 = x / 2 + 2;
        int k2 = x / 2 + 2;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == x-1) {
                    System.out.print("* ");
                } else if (j == k1 || j== k2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            k1--;
            k2++;
            System.out.println();
        }
    }
}
