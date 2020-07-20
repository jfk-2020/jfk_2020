package com.jfk.lesson03;

import java.util.ArrayList;
import java.util.List;

public class Task051 {
    public static void main(String[] args) {
        int number = 223;//456078;
        int[] numbers = getNumbers(number);
        for (int x : numbers){
            System.out.println(x);
        }
        System.out.println(numbers[0] == numbers[1] + numbers[2]);

    }

    public static int[] getNumbers(int number) {
        List<Integer> numbers = new ArrayList<>();
        int i = 1;
        while (true) {
            i *= 10;
            int a = number % i / (i/10);
            numbers.add(a);
            if (number / i * 10 == 0){
                break;
            }
        }
        int[] nums = new int[numbers.size()];
        i = 0;
        for(int x: numbers){
            nums[i] = x;
            i++;
        }
        return nums;
    }
}
