package Homework_646_660;

public class Task_651 {
    public static void main(String[] args) {

        int n = 8;
        int count = 0;
        char[] char1 = {'a', 'z', 'j', 'k', 'l', 'l', 'p', 'z'};
        char[] char2 = new char[n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < char1.length; k++) {
                if (char1[i] == char1[k]) {
                    count++;
                }
            }
            if (count == 1) {
                char2[i] = char1[i];
            }
            count = 0;
        }
        System.out.println(char2);
    }
}
