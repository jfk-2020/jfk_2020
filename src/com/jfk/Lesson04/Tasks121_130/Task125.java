package com.jfk.Lesson04.Tasks121_130;

public class Task125 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10; i++){
            double x = 0;
            double y = 0;
            if ((i/3.0) % 1 == 0) {
                x = Math.log(i);
            } else {
                x = 3;
            }
            if ((i/7.0 % 1 == 0)) {
                y = Math.log(i) / Math.log(3);
            } else {
                y = 3;
            }
            System.out.println("x = " + x + "; y = " + y);
            sum += (x - y);
        }
        System.out.println(sum);
    }
}
