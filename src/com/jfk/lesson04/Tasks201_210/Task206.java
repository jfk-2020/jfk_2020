package com.jfk.lesson04.Tasks201_210;

import com.jfk.lesson03.Task051;

public class Task206 {
    public static void main(String[] args) {
        int N =1343355;
        int[] nums = Task051.getNumbers(N);
        int NR = 0;
        for (int i = 0; i < nums.length; i++) {
           NR += nums[nums.length - 1 - i] * Math.pow(10, i);
        }
        System.out.println(NR);
    }
}
