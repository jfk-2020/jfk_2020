package com.jfk.Lesson04.Tasks121_130;

public class Task130 {
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 1; i <= 10; i++){
            double x = 0;
            double y = 0;
            if ((i/5.0) % 1 == 0) {
                x = i;
            } else {
                x = i * i;
            }
            if ((i/3.0 % 1 == 0)) {
                y = i * i * i;
            } else {
                y = 6;
            }
            System.out.println("x = " + x + "; y = " + y);
            sum *= (x * y);
        }
        System.out.println(sum);
    }
}
