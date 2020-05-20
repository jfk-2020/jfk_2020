package com.jfk.homework05.homework261_270;

public class Task_270 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 3, 7, 12, 27};
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += Math.pow(array[i], 2);
        }
        System.out.println(sum);
    }
}
