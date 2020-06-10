package com.jfk.homework09;

//Sum of all the elements in the array
public class Recursion_03 {
    //Function to return the sum of all the elements in an array
    public static int sumOfElements(int array[], int n) {

        //if the size = 0, means the whole array has been traversed
        if (n == 0) {
            return 0;

        }
        return (sumOfElements(array, n - 1) + array[n - 1]);
    }

    //driver code
    public static void main(String[] args) {

        int array[] = {1, 3, 7, 10, 2};

        //calling the function
        System.out.println(sumOfElements(array, array.length));

    }
}


