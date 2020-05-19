package Tasks_from_211_to_230;

public class Task_218 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 5;
        numbers[1] = -6;
        numbers[2] = 7;
        numbers[3] = -8;
        numbers[4] = 9;
        numbers[5] = -4;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                if(numbers[i] < 0){
                    numbers[i] *= -1;
                }
                 else if (numbers[i] > 0){
                    numbers[i] *= 1;
                }
                sum = sum + numbers[i];
                count++;
            }
        }
        System.out.println(sum);
    }
}
