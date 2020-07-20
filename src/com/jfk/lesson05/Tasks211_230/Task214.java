package com.jfk.lesson05.Tasks211_230;

public class Task214 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6,19,0, -34,3,-33,-32};
        int sum = 0;
        int k = 0;
        for (int x : array) {
            if (x < 0) {
                sum += x*x;
                k++;
            }
        }
        if (k > 0) {
            System.out.println(1.0 * sum/k);
        } else {
            System.out.println(0);
        }
    }
}
