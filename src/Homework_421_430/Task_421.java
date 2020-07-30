package Homework_421_430;

import com.jfk.ArrayElementGenerator;

public class Task_421 {
    public static void main(String[] args) {

        int[][] ints = {
                {3, 8, -4, 6},
                {2,-9,  6, 7},
                {1, 0, -4, 5},
                {3, 4, -8, 1},
        };
        int l = 3;
        int count  = 0;
        for (int i = 1;i < ints.length ;i++)

        {for (int k =0; k< i ; k++){if (ints[i][k] % l == 0){count ++;};
        System.out.print(ints[i][ k]+" " );}
            System.out.println();

    }
        System.out.println(count);
}
}