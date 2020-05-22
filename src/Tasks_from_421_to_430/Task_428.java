package Tasks_from_421_to_430;

public class Task_428 {
    public static void main(String[] args) {
        int[][] array = {

                {3, 0, 8, 6},
                {4, 3, 0, 1},
                {0, 5, 8, 9},
                {1, 3, 4, 3}

        };

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length - i; k++) {
                if (array[i][k] == 0) {
                    count++;
                }
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(count);
    }
}
