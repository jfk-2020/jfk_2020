package Homework_421_430;

public class Task_428 {
    public static void main(String[] args) {
        int[][] ints = {
                {3, 5, -1,  0},
                {2, -5, 8, -4},
                {-3, 6, 0, -8},
                {-7, -5, 3, 8},};
        int count = 0;
        for (int i = 0 ; i <ints.length ; i++){
            for (int z =i ; z < ints.length ;z ++){
                if (ints [i][z] ==0){
                    count ++;
                }
                System.out.print(ints[i][z] + "  ");
            }
            System.out.println();
        }
        System.out.println( count);
    }
}
