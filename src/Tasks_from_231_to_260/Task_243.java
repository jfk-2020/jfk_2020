package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_243 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int t = 2;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % t == 0) {
                count++;
            }
        }
        System.out.println("Total count of items: " + count);
    }
}
