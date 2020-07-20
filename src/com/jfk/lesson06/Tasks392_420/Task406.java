package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson03.Task051;
import com.jfk.lesson06.ArrayGenerator;

public class Task406 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int max = 0;
        int index = 0;
        for (int i = 0; i < x.length; i++) {
            int[] nums = Task051.getNumbers(Math.abs(x[i]));
            int sum = 0;
            for (int s: nums) {
                sum += s;
            }
            if (max < sum) {
                max = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
