package Homework_646_660;

public class Task_656 {
    public static void main(String[] args) {
        int n = 7;
        char[] char1 = {'l', 'x', 'j', 'k', 'x', 'a', 'p'};

        int count = 0;
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] == 'x') {
                count++;
            }
        }
        char[] char2 = new char[n + count];
        int x = 0;
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] =='x') {char2 [i+x] = 'y';char2 [i+x+1] = 'y';
            x++;
            } else {
                char2[i+x]=char1[i];
            }
        }
        System.out.println(char2);
    }
}
