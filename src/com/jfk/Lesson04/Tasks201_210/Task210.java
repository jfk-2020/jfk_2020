package com.jfk.Lesson04.Tasks201_210;

import com.jfk.Lesson03.Task051;

public class Task210 {
    public static void main(String[] args) {
        int N =1343355;
        int[] nums = Task051.getNumbers(N);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) % 2 == 0) {
                sum2 += nums[i];
            } else {
                sum1 += nums[i];
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum1 == sum2);
    }
}
