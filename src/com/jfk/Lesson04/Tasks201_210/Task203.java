package com.jfk.Lesson04.Tasks201_210;

import com.jfk.Lesson03.Task051;

public class Task203 {
    public static void main(String[] args) {
        int N =1343355;
        int[] nums = Task051.getNumbers(N);
        int sum = 1;
        for (int x : nums) {
            sum *= x;
        }
        System.out.println(sum);
    }
}
