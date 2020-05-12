package com.jfk.Lesson04.Tasks121_130;

public class Task123 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 14; i++){
            double x = 0;
            double y = 0;
            if (i % 2 == 1) {
                x = Math.pow(Math.E, i - 4);
            } else {
                x = i*i - i;
            }
            y = Math.pow(i, 4);
            sum += (x*x * y*y);
        }
        System.out.println(sum);
    }
}
