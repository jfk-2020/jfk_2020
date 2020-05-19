package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_239 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int sumPow = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) {
                sumPow = (int) (sumPow + Math.pow(numbers[i], 2));
                count++;
            }
        }
        System.out.println((double)Math.sqrt(sumPow / count));
    }
}
