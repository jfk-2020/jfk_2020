package Homework_421_430;

public class Task_429 {
    public static void main(String[] args) {
        int[][] ints = {
                {3, 5, -1, -8},
                {2, -5, 8, -4},
                {-3, 6, -1, -8},
                {-7, -5, 3, 8},};
        int count = 0;

        for (int i = 0 ; i <ints.length ; i++){
            for (int z =i ; z < ints.length ;z ++){
                if (ints [i][z]%5 ==2){
                    count++;
                }
                System.out.print(ints[i][z] + "  ");
            }
            System.out.println();
        }
        System.out.println( count);
    }
}
