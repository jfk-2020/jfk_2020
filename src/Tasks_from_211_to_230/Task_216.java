package Tasks_from_211_to_230;

public class Task_216 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 6;
        numbers[2] = 7;
        numbers[3] = 8;
        numbers[4] = 9;
        int multiply = 1;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                multiply = multiply * numbers[i];
                count++;
            }
        }
        System.out.println(multiply);
    }
}
