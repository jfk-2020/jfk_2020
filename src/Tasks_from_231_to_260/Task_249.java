package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_249 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(3);
        ArrayElementGenerator.displayArray(numbers);
        int count = 0;
        int k = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i] - i) > k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
