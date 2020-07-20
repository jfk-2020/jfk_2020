package com.jfk.lesson06.Tasks358_381;

import com.jfk.lesson06.ArrayGenerator;

public class Task376 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int i = 0;
        int x = 6;
        while (i < 10) {
            x++;
            if (x % 5 != 0) {
                continue;
            }
            boolean isExist = false;
            for (int j1 = 1; j1 < x; j1++) {
                for (int j2 = j1; j2 < x; j2++) {
                    int sum = j1*j1 + j2*j2;
                    if (sum == x) {
                        isExist = true;
                        System.out.println("j1 = " + j1 + "; j2 = " + j2 + "; sum = " + sum);
                        break;
                    } else if (sum > x) {
                        break;
                    }
                }
                if (isExist) {
                    break;
                }
            }
            if (isExist) {
                nums[i++] = x;
            }
        }
        ArrayGenerator.displayArray(nums);
    }
}
