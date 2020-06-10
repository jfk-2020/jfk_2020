package com.jfk.homework09;

//Min element in the array
public class Recursion_02 {

    // function to return minimum element using recursion
    public static int findMinElement(int array[], int n) {
        // if size = 0, means the whole array has been traversed
        if (n == 1) {
            return array[0];
        }
        return Math.min(array[n - 1], findMinElement(array, n - 1));
    }

    // Driver code
    public static void main(String args[]) {
        int array[] = {18, 27, 37, 3, -7, 10, 5};
        int n = array.length;

        //Calling the function
        System.out.println(findMinElement(array, n));
    }
}