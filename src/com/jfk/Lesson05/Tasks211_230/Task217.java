package com.jfk.Lesson05.Tasks211_230;

public class Task217 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6,19,0, -34,3,-33,-32};
        int sum = 1;
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 1) {
                sum *= array[i]*array[i];
            }
        }
        System.out.println(sum);
    }
}
