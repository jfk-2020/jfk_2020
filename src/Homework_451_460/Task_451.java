package Homework_451_460;

public class Task_451 {
    public static void main(String[] args) {
        int[][] ints = {
                {5, 6, -3, 0},
                {-3, 6, 5, 2},
                {5, -4, 1, 0},
                {9, 0, -4, 4}
        };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int k = i; k < i + 1; k++) {
                count++;
                sum = sum + ints[i][k];
                System.out.print(ints[i][k]);
            }
            System.out.println(); }
        System.out.println();

        for (int x = 0; x<ints.length; x++) {
                for (int y = ints.length-x-1; y <ints.length - x; y=y+1) {
                    count++;
                    sum = sum + ints[x][y];
                    System.out.print(ints[x][y]);
                }
                System.out.println();
        }
        System.out.println((double)sum/count);
    }
}
