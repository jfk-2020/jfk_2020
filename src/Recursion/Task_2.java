package Recursion;

public class Task_2 {
    public static void main(String[] args) {
        int[] ints = {-13, 8, 7, 5, -4, -2, 5};
        int min = 1;
        int minimum = getminimumvalue(ints ,ints[0], 0);
        System.out.println(minimum);
    }

    public static int getminimumvalue(int[] array,int minimum, int index ) {
        if (index == array.length) {
            return minimum;
        } else {
            if (array[index] < minimum) {
                minimum = array[index];return getminimumvalue(array , minimum, ++index);
            }

        }return getminimumvalue(array , minimum , ++index);
    }
}

