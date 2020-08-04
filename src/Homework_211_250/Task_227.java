package Homework_211_250;

public class Task_227 {
    public static void main(String[] args) {
        int[] array = {5, -8, 12, -4, 13, 15, -6};
        int count = 0;
        int sum = 0;
        int k = 3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum = sum + array[i];
               count = count + 1;
            }
        }
        System.out.println((double)sum /count);
    }
}
