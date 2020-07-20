package com.jfk.lesson05.Tasks211_230;

public class Task219 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6,19,0, -34,3,-33,-32};
        int k = 3;
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (i % k == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
