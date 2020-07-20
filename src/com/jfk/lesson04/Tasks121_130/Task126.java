package com.jfk.lesson04.Tasks121_130;

public class Task126 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 16; i++){
            double x = 0;
            double y = 0;
            if ((i/5.0) % 1 == 0) {
                x = i;
            } else {
                x = 0;
            }
            if ((i/7.0 % 1 == 0)) {
                y = i*i;
            } else {
                y = i;
            }
            System.out.println("x = " + x + "; y = " + y);
            sum += (x - y);
        }
        System.out.println(sum);
    }
}
