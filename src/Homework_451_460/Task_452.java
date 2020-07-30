package Homework_451_460;

public class Task_452 {
    public static void main(String[] args) {
        int[][] ints = {
                {5, 6, -3, 0},
                {-3, 6, 5, 2},
                {5, -4, 1, 0},
                {9, 0, -4, 4}
        };
        int a = 0;
        int v = 0;
        for (int i  = 0 ; i <1 ; i++){
            for (int k = 0; k <1 ; k++){
                System.out.println(ints[i][k]); a = ints[i][k];;
            }

        }
        System.out.println();
        for (int x = ints.length-1;x<ints.length ; x++){
            for (int y = ints.length-1; y <ints.length ; y++){
                System.out.println(ints[x][y]); v = ints[x][y] ;break;

            }
        }

        System.out.println((double)Math.pow(a,2)+ Math.pow(v,2));

    }
}
