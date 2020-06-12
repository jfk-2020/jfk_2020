package com.jfk.homework09;

//Binary search
public class Recursion_05 {
    //Function for binary search
    public static int binarySearch(int[] array, int x, int start, int end) {
        //find the mid element
        int mid = (start + end) / 2;
        if (x > array[mid]) {
            return binarySearch(array, x, mid, end);
        } else if (x < array[mid]) {
            return binarySearch(array, x, start, mid);
        } else if (x == array[mid]) {
            return mid;
        } else {
            return -1;
        }
    }

    public static int noBinarySearchFindIndex(int[] array, int number) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 4, 5, 7, 9, 13};
        int x = 74344;
        //Check if the target number does not exist in the array
        if (x > array[array.length - 1] || x < array[0]) {
            System.out.println("X is not found");
        } else {
            //Call the function
            System.out.println(binarySearch(array, x, 0, array.length));
        }

        int index = noBinarySearchFindIndex(array, 1);
        System.out.println(index);

    }
}