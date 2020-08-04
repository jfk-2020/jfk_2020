package Homework_451_460;

public class Task_455 {
    public static void main(String[] args) {
        int[][] ints = {
                {5, 6, -3, 1},
                {-3, 6, 5, 2},
                {5, -4, 1, 0},
                {9, 0, -4, 4}
        };
        int sum =1;
        int sums = 1;
        for (int i = 0;i <ints.length ; i++){
            for (int k = i; k < i+1 ; k++){sum = sum * ints[i][k];System.out.println(ints[i][k]);}
        }

        for (int x = 0 ; x < ints.length;x++){
            for (int y = ints.length-1-x ;y < ints.length-x;y++){
                sums = sums * ints [x][y];
                System.out.println(ints[x][y]);}
        }
        System.out.println((double)sum * sums);
    }
}
