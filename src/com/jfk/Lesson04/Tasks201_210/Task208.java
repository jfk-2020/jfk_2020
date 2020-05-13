package com.jfk.Lesson04.Tasks201_210;

import com.jfk.Lesson03.Task051;

public class Task208 {
    public static void main(String[] args) {
        int N =1343355;
        int[] nums = Task051.getNumbers(N);
        boolean t = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[0]) {
                t = false;
                break;
            }
        }
        System.out.println(t);
    }
}
