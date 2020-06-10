package com.jfk.homework09;

//Palindrome
public class Recursion_04 {

    //Function to check if the array is palindrome
    public static int palindrome(int array[], int start, int end) {

        if (start >= end) {
            return 1;
        }
        if (array[start] == array[end]) {
            return palindrome(array, start + 1, end - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int array[] = {3, 6, 1, 6, 3};

        System.out.println(palindrome(array, 0, array.length - 1));
    }
}
