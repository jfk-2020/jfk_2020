package Tasks_from_421_to_430;

public class Task_430 {
    public static void main(String[] args) {

        int[][] array = {

                {3, 0, 8, 6},
                {4, 3, 0, 1},
                {0, 5, 8, 9},
                {1, 3, 4, 3}

        };

        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < i + 1; k++) {
                if (array[i][k] % 2 == 0) {
                    sum += array[i][k];
                    count++;
                }
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
        System.out.print((double) sum / count);
    }
}

