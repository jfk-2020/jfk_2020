package com.jfk.lesson04.Tasks201_210;

import com.jfk.lesson03.Task051;

public class Task202 {
    public static void main(String[] args) {
        int N =1343355;
        int[] nums = Task051.getNumbers(N);
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        System.out.println(sum);
    }
}
