package Homework_421_430;

public class Task_423 {
    public static void main(String[] args) {
        int[][] ints = {
                {3, 5, -1, -8},
                {2, -5, 8, -4},
                {-3, 6, -1, -8},
                {-7, -5, 3, 8},};
                int sum = 0;
                for (int i  = 0 ; i < ints.length ; i++){
                    for ( int k = 0 ; k < i+1 ; k++){
                        int l = ints[i][k] * ints [i][k];
                        if (ints[i][k] % 2 == 0){sum = sum + l;}
                        System.out.print(ints[i][k] + " ");
                    }
                    System.out.println();
                }
        System.out.println((double) Math.sqrt(sum));

    }
}
