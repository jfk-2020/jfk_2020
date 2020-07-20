package com.jfk.lesson04.Tasks121_130;

public class Task128 {
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 1; i <= 14; i++){
            double x = 0;
            double y = 0;
            if (i % 2 == 0) {
                x = Math.pow(Math.E, 3*i - 4);
            } else {
                x = i*i - i;
            }
            y = Math.pow(i - 1, 2);
            System.out.println("x = " + x + "; y = " + y);
            sum *= (x * y * y);
        }
        System.out.println(sum);
    }
}
