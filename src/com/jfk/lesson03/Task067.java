package com.jfk.lesson03;

public class Task067 {
    public static void main(String[] args) {
        int number = 7734;
        int[] numbers = Task051.getNumbers(number);
        if (number == Math.pow(numbers[0] + numbers[1] + numbers[2] + numbers[3], 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        for (int i = 1000; i < 10000; i ++) {
            int nums[] = Task051.getNumbers(i);
            System.out.println("i = " + i + "; sum = " + (nums[0] + nums[1] + nums[2] + nums[3]) + "; sum2 = " + Math.pow(nums[0] + nums[1] + nums[2] + nums[3], 2));
            if (i == Math.pow(nums[0] + nums[1] + nums[2] + nums[3], 2)) {
                System.out.println(i);
            }
        }
    }
}
