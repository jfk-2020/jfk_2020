package Homework_211_250;

public class Task_229 {
    public static void main(String[] args) {
        int[] array = {5, -8, 12, -4, 13, 15, -6};
        int sum = 1;
        int k = 3;
        for (int i = 0; i < array.length; i++) {
           if (array[i]-i > 0){sum = sum * array[i];}
        }
        System.out.println(sum);
    }
}
