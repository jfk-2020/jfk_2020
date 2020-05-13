package com.jfk.Lesson04.Tasks201_210;

import com.jfk.Lesson03.Task051;

public class Task205 {
    public static void main(String[] args) {
        int N =1343355;
        int[] nums = Task051.getNumbers(N);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[nums.length - 1 - i]);
        }
    }
}
