package com.jfk.Lesson04.Tasks121_130;

public class Task121 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <=16; i++){
            double x = 0;
            double y = 0;
            if (i % 2 == 1) {
                x = i;
            } else {
                x = Math.pow(i, 3);
            }
            if (i*i % 2 == 1) {
                y = i*i;
            } else {
                y = i;
            }
            sum += (x - y)*(x - y);
        }
        System.out.println(sum);
    }
}
