package Homework_421_430;

public class Task_427 {
    public static void main(String[] args) {
        int[][] ints = {
                {3, 5, -1, -8},
                {2, -5, 8, -4},
                {-3, 6, -1, -8},
                {-7, -5, 3, 8},};
        int sum = 1;
        int k = 3 ;
        for (int i = 0 ; i <ints.length ; i++){
            for (int z =i ; z < ints.length ;z ++){
                if (ints [i][z]%k ==0){
                    sum = sum * ints[i][z];
                }
                System.out.print(ints[i][z] + "  ");
            }
            System.out.println();
        }
        System.out.println( sum);
    }
}
