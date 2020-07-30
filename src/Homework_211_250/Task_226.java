package Homework_211_250;

public class Task_226 {
    public static void main(String[] args) {
        int []array = {5,-9,-7,8,12,3,-23,12,2};
        int k = 8;
        int count = 0;
        for (int i  = 0 ; i < array.length ; i++)
            if (array[i] > (-1 * k) && array[i] < k) {
                count = count +1;
            }
        System.out.println(count);


    }
}
