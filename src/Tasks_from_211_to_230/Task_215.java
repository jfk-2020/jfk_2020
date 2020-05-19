package Tasks_from_211_to_230;

public class Task_215 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum = sum + numbers[i];
                count++;
            }
        }
        System.out.println(sum);
    }
}
