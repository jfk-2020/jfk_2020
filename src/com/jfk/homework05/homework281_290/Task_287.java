package com.jfk.homework05.homework281_290;

public class Task_287 {
    public static void main(String[] args) {
        int[] x = new int[]{3, 1, 4, 10, 7, 5, 8};

        int count = 0;

        for(int i = 0; i < x.length; i++){
            if (x[i] != i){
                count++;
            }
        }
        int[] y = new int[count];
        int z = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] != i){
                y[z] = x[i];
                z++;
            }
        }
        for(int i = 0; i < y.length; i++){
            System.out.println(y[i]);
        }
    }
}
