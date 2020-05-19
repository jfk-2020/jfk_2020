package Tasks_from_211_to_230;

public class Task_230 {
    public static void main(String[] args) {
        int[] numbers = {-10, -5, 3, -20, 60};
        int k = 2;
        int sumPow = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % k == 0) {
                sumPow = (int) (sumPow + Math.pow(numbers[i], 2));
                count++;
            }
        }
        System.out.println((double)Math.sqrt(sumPow / count));
    }
}
