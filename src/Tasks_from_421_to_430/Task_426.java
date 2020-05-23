package Tasks_from_421_to_430;

public class Task_426 {
    public static void main(String[] args) {


        int[][] array = {

                {3, 6, 8, 6},
                {4, 3, 6, 1},
                {2, 5, 8, 9},
                {1, 3, 4, 3}

        };

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length - i; k++) {
                if (array[i][k] % 2 == 0) {
                    sum = sum + array[i][k];
                    count++;
                }
               System.out.print(array[i][k] + " ");
            }
           System.out.println();
        }
        System.out.println(sum);
    }
}
