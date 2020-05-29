package Homework_646_660;

public class Task_657 {
    public static void main(String[] args) {
        int n = 7;
        char[] char1 = {'l', 'x', 'j', 'k', 'x', 'a','k','o'};
        char[] char2 = new char[char1.length ];
        int x = 0;
        for (int i = 0; i < char1.length /2; i++) {
            if (char1[i + x] >= char1[i + 1 + x]) {
                char2[i] = char1[i + x];
                x++;
            } else {
                char2[i] = char1[i + x + 1];
                x++;
            }
        }
        System.out.println(char2);
    }
}
