package Homework_451_460;

public class Task_458 {
    public static void main(String[] args) {
        int[][] ints = {
                {5, 6, -3, 0},
                {-3, 6, 5, 2},
                {5, -4,-1, 0},
                {9, 0, -4, 4}
        };
        int count = 0;
        int k =4;

        for (int i = 0; i< ints.length; i++){
            for (int f = 0 ; f < ints.length ; f++){if (ints[i][f] >k || ints[i][f] < -k )
            { count ++;}
            }
        }
        System.out.println(count);
    }
}
