package Homework_451_460;

public class Task_457 {
    public static void main(String[] args) {
        int[][] ints = {
                {5, 6, -3, 0},
                {-3, 6, 5, 2},
                {5, -4,-1, 0},
                {9, 0, -4, 4}
        };
        double sum =0;

        for (int i = 0; i< ints.length; i++){
            for (int k = 0 ; k < ints.length ; k++){if (ints[i][k] % 2 != 0)
                { sum = sum + ints[i][k];}
            }
        }
        System.out.println(sum);
    }
}
