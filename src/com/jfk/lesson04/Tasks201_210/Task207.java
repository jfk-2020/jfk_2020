package com.jfk.lesson04.Tasks201_210;

import com.jfk.lesson03.Task051;

public class Task207 {
    public static void main(String[] args) {
        int N =1343355;
        int[] nums = Task051.getNumbers(N);
        boolean t = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}
