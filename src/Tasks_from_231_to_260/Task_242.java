package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_242 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int multiple = 1;
        int m = 2;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % m == 0) {
                multiple = multiple * numbers[i];
            }
        }
        System.out.println("Total product of items: " + multiple);
    }
}
