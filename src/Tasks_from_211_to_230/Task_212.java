package Tasks_from_211_to_230;

public class Task_212 {
    public static void main(String[] args) {
        int[] numbers = new int [5];
        numbers[0] = 4;
        numbers[1] = 2;
        numbers[2] = -8;
        numbers[3] = 3;
        numbers[4] = 5;
        int sumPow = 0;
        int sqrt = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sumPow = (int) (sumPow + Math.pow(numbers[i], 2));
                count++;
            }
        }
        System.out.println((double)Math.sqrt(sumPow / count));
    }
}
