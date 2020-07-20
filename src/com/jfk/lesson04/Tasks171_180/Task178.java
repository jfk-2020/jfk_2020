package com.jfk.lesson04.Tasks171_180;

public class Task178 {
    public static void main(String[] args) {
        int N = 10;
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        for (int k = 4; k <= N; k++){
            int x = x3;
            int xx = x2;
            x3 = x3 + x2 - 2*x1;
            x2 = x;
            x1 = xx;
            System.out.println(x3);
        }
    }
}
