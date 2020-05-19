package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_248 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(3);
        ArrayElementGenerator.displayArray(numbers);
        int sum = 0;
        int k = 2;

        for (int i = 0; i < numbers.length; i++) {
            if (Math.pow((numbers[i] + i), 2) % k == 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}
