package com.jfk;

public class Task_221 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        int b = 8;

        int[] array = new int[]{2, 5, 7, 12, 20};

        if(a < 0 || a > array.length){
            a = 0;
        }

        if(b <= a || b > array.length){
            b = array.length;
        }

        for (int i = a; i < b; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
