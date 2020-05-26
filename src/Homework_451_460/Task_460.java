package Homework_451_460;

public class Task_460 {
    public static void main(String[] args) {
        int[][] ints = {
                {5, 6, -3, 1},
                {-3, 1, 5, 2},
                {5, -4,-1, 1},
                {2, 1, -4, 4}
        };
        double sum =1;

        for (int i = 0; i< ints.length; i++){
            for (int k = 0 ; k < ints.length ; k++){
                if (ints[i][k] % 2 == 0){ sum = sum * Math.pow(ints[i][k],2);}
            }
        }
        System.out.println(sum);

    }
}
