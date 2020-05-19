package Tasks_from_211_to_230;

public class Task_213 {
    public static void main(String[] args) {
        int[] numbers = new int [6];
        numbers[0] = -3;
        numbers[1] = -5;
        numbers[2] = 6;
        numbers[3] = 2;
        numbers[4] = -15;
        numbers[5] = 7;
        int sumPow = 0;
        int count = 0;

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] < 0) {
                sumPow = (int) (sumPow + Math.pow(numbers[i], 2));
                count++;
            }
        }
        System.out.println((double)Math.sqrt(sumPow / count));
    }
}
