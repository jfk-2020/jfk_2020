package com.jfk.lesson04.Tasks121_130;

public class Task124 {
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 2; i <= 18; i++){
            double x = 0;
            double y = 0;
            if (i % 2 == 1) {
                x = Math.pow(2, i - 4);
            } else {
                x = i*i + 2;
            }
            y = Math.pow(i, 2) + 2;
            sum *= x * y;
        }
        System.out.println(sum);
    }
}
