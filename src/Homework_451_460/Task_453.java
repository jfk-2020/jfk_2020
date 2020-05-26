package Homework_451_460;

public class Task_453 {
    public static void main(String[] args) {
        int[][] ints = {
                {5, 6, -3, 0},
                {-3, 6, 5, 2},
                {5, -4,-1, 0},
                {9, 0, -4, 4}
        };
        int a = -2;
        int b = 3;
        int sum =0;

        for (int i = 0; i< ints.length; i++){
            for (int k = 0 ; k < ints.length ; k++){
                if (ints[i][k] >= a && ints[i][k]<=b){
                   sum = sum + ints[i][k];}
            }
        }
        System.out.println(sum);
    }
}
