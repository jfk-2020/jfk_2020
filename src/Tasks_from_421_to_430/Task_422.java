package Tasks_from_421_to_430;

public class Task_422 {
    public static void main(String[] args) {
        int[][] array = {

                {3, 6, 8, 6},
                {10, 3, 6, 1},
                {2, 5, 8, 9},
                {1, 3, 4, 3}

        };

        int count = 0;
        int sum = 0;
        int n = 5;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < i; k++) {
                if (array[i][k] % n == 0) {
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
