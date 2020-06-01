package Homework_686_694;

public class Task_694 {
    public static void main(String[] args) {
        char[] char1 = {'9', '-', '4', '+', '2', '-', '5',};
        int sum = char1[0] - 48;
        for (int i = 0; i < char1.length; i++) {
            if
            (char1[i] == 45) {
                sum = sum - (char1[i + 1] - 48);
            } else {
                if (char1[i] == 43) {
                    sum = sum + (char1[i + 1] - 48);
                }
            }
        }
        System.out.println(sum);
    }

}

