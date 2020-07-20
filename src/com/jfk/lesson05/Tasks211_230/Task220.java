package com.jfk.lesson05.Tasks211_230;

public class Task220 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6,19,0, -34,3,-33,-32};
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0){
                negative++;
            }
        }
        System.out.println("positive = " + positive + "; negative =" + negative);
    }
}
