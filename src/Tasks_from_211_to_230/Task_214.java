package Tasks_from_211_to_230;

public class Task_214 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = -2;
        numbers[1] = -10;
        numbers[2] = -20;
        numbers[3] = 2;
        numbers[4] = 5;
        numbers[5] = 62;
        numbers[6] = -15;
        numbers[7] = -3;
        numbers[8] = 12;
        numbers[9] = 22;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] < 0){
                sum = sum + numbers[i];
                count++;
            }
        }
        System.out.println((double) sum / count);
    }
}
