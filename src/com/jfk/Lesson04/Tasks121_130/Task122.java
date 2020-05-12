package com.jfk.Lesson04.Tasks121_130;

public class Task122 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10; i++){
            double x = 0;
            double y = 0;
            if (i % 2 == 1) {
                x = Math.pow(Math.E, i - 4);
            } else {
                x = i*i - i;
            }
            if (i*i % 2 == 1) {
                y = Math.pow(Math.tan(i) , 2);
            } else {
                y = 0;
            }
            sum += (x*x - y*y);
        }
        System.out.println(sum);
    }
}
